package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtils {
	
	private static String url="";
	private static String userName="";
	private static String userPwd="";//.class
	private static String driverClass="";
	
	static{
		try {
			//����һ�����Լ�����
			Properties pro=new Properties();
			//ͨ��pro����ȥ����jdbc.properties�ļ�
			InputStream in=DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			pro.load(in);
			driverClass=pro.getProperty("driverClass");
			userName=pro.getProperty("userName");
			userPwd=pro.getProperty("userPwd");
			url=pro.getProperty("url");
			Class.forName(driverClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  public static void main(String[] args) {
	
}

	//�ṩ��ȡ���Ӷ���ķ���  
	public Connection getConnection(){
	    Connection cn=null;
		try {
			cn = DriverManager.getConnection(url, userName,userPwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return cn;
	}
	
	//�ṩ�ر���Դ�ķ���
	public void closeAll(Connection cn,Statement st,ResultSet rs){
		try {
			    if(rs!=null) rs.close();
			    if(st!=null) st.close();
				if(cn!=null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	//ִ����ɾ�ĵķ�����������Ӱ�������
	public int executeUpdate(String sql,Object[] parms){
		Connection cn=getConnection();
		PreparedStatement pst=null;
		int count=0;
		try {
			pst=cn.prepareStatement(sql);
			//���ò���
			if(parms!=null){
				for(int i=0;i<parms.length;i++){
					pst.setObject(i+1, parms[i]);
				}
			}
		    count=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			 closeAll(cn, pst, null);
		}
		return count;
	}
	
	//ִ�в�ѯ�ķ��������ؽ����
	public ResultSet executeQuery(String sql,Object[] parms){
		Connection cn=getConnection();
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=cn.prepareStatement(sql);
			//���ò���
			if(parms!=null){
				for(int i=0;i<parms.length;i++){
					pst.setObject(i+1, parms[i]);
				}
			}
			rs=pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}

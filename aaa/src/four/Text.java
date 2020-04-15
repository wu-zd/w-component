package four;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import dao.DBUtils;
import util.Dept;

public class Text {
	private static DBUtils db = new DBUtils();
	public static void main(String[] args) throws SQLException, IOException {
		/* �������ݿ�Ĳ��ű���ȡ���еĲ�����Ϣ������ȡ�Ĳ�����Ϣ���浽depts.xml�ļ��С� */ 
		List<Dept> list = selectAll();
		Document document = DocumentHelper.createDocument();//�����ĵ�
	    Element root = document.addElement("depts");//�������ڵ�
		for (Dept dept : list) {
			String dno = String.valueOf(dept.getDeptNo());
			String name = dept.getDname();
			String dloc = dept.getLoc();
		    Element depts = root.addElement("dept");//�����ӽڵ�
		    Element deptno = depts.addElement("deptno");//�����ӽڵ�
		    Element dname = depts.addElement("dname");//�����ӽڵ�
		    Element loc = depts.addElement("loc");//�����ӽڵ�

		    deptno.setText(dno);
		    dname.setText(name);
		    loc.setText(dloc);
		} 
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xw=new XMLWriter(new FileOutputStream("depts.xml"),format);
		xw.write(document);
		xw.close();
	    
	}
	public static List<Dept> selectAll() throws SQLException{
		List<Dept> list = new ArrayList<Dept>();
		String sql = "select * from dept";
		ResultSet rs = db.executeQuery(sql, null);
		while (rs.next()) {
			Dept d = new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
			list.add(d);
		}
		return list;
	}
}

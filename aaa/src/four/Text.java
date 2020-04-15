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
		/* 访问数据库的部门表，获取所有的部门信息，将获取的部门信息保存到depts.xml文件中。 */ 
		List<Dept> list = selectAll();
		Document document = DocumentHelper.createDocument();//创建文档
	    Element root = document.addElement("depts");//创建根节点
		for (Dept dept : list) {
			String dno = String.valueOf(dept.getDeptNo());
			String name = dept.getDname();
			String dloc = dept.getLoc();
		    Element depts = root.addElement("dept");//创建子节点
		    Element deptno = depts.addElement("deptno");//创建子节点
		    Element dname = depts.addElement("dname");//创建子节点
		    Element loc = depts.addElement("loc");//创建子节点

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

package three;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import dao.DBUtils;

public class Text {

	public static void main(String[] args) throws DocumentException {
		/*
		 * 数据库表名：ClassTable 表中字段：sno(学号), name(姓名), sex(性别)
		 */
		
		
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("class.xml"));
		Element sall=doc.getRootElement();
		List<Element> stu =sall.elements("student");
		int count = 0;
		for (Element s : stu) {
			String sno = s.attributeValue("sno");
			String name = s.elementText("name");
			String sex = s.elementText("sex");
//			ClassTable ct = new ClassTable();
//			ct.setSno(sno);
//			ct.setName(name);
//			ct.setSex(sex);
			ClassTable ct=new ClassTable(sno, name, sex);
			count = addsql(ct);
		}
		if(count>0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		
		
	}
	public static int addsql(ClassTable ct) {
		String sql = "insert into CLASSTABLE values(?,?,?)";
		DBUtils d = new DBUtils();
		Object[] parms = {ct.getSno(),ct.getName(),ct.getSex()};
		int count = d.executeUpdate(sql, parms);
		return count;
	}

}

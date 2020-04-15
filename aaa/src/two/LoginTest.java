package two;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class LoginTest {
	/*
	 * 写一个LoginTest登录功能的实现。 根据用户输入的用户名和密码，查询该用户能否登录。
	 * 若users.xml中存在此用户，则提示“登录成功”，否则提示“请检查用户名和密码”。
	 */
	public static void main(String[] args) throws DocumentException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String name = input.next();
		System.out.println("请输入密码:");
		String pwd = input.next();
		List<Users> list = new ArrayList<Users>();
		
		SAXReader reader=new SAXReader();
		Document doc=reader.read(new File("users.xml"));
		Element uall=doc.getRootElement();
		List<Element> user =uall.elements("user");
		int count = 0;
		for (Element u : user ) {
			String uname=u.attributeValue("uname");
			String upass=u.attributeValue("upass");
			if(uname.equals(name) && upass.equals(pwd)) {
				count++;
			}
			/*
			 * Users users = new Users(uname,upass); list.add(users);
			 */
		}
		if(count>0) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
		/*
		 * for (Users u : list) { System.out.println(u.getUname());
		 * if(u.getUname().equals(name)&&u.getUpass().equals(pwd)) {
		 * System.out.println("成功"); }else { System.out.println("失败"); } }
		 */
	}
}

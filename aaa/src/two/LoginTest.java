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
	 * дһ��LoginTest��¼���ܵ�ʵ�֡� �����û�������û��������룬��ѯ���û��ܷ��¼��
	 * ��users.xml�д��ڴ��û�������ʾ����¼�ɹ�����������ʾ�������û��������롱��
	 */
	public static void main(String[] args) throws DocumentException {
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���:");
		String name = input.next();
		System.out.println("����������:");
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
			System.out.println("�ɹ�");
		}else {
			System.out.println("ʧ��");
		}
		/*
		 * for (Users u : list) { System.out.println(u.getUname());
		 * if(u.getUname().equals(name)&&u.getUpass().equals(pwd)) {
		 * System.out.println("�ɹ�"); }else { System.out.println("ʧ��"); } }
		 */
	}
}

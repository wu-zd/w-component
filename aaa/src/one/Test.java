package one;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Test {
	/* ����products.xml,
	 * ��һ����Ʒ��ǩ���н�����װ��һ����Ʒ����,
	 * ���洢����Ʒ�ļ����С�
	 * ����������������е���Ʒ��Ϣ�� */
	public static void main(String[] args) throws Exception {
		List<PRODUCT> lp=new ArrayList<PRODUCT>();
		SAXReader reader = new SAXReader();
	    Document doc=reader.read(new File("products.xml"));//��ȡ�ļ�
	    Element root=doc.getRootElement(); 
	    List<Element> list= root.elements("product"); 
	    System.out.print("ID: \t����: \t����: \t��ɫ: \t�ߴ�: \t���:");
	    for (Element product : list) {
			String  ID=product.attributeValue("ID");
			String NAME=product.elementText("NAME");
			int PRICE=Integer.parseInt(product.elementText("PRICE"));
			String COLOR=product.elementText("COLOR");
			int SIZE=Integer.parseInt(product.elementText("SIZE"));
			int REPERTORY=Integer.parseInt(product.elementText("REPERTORY"));
			PRODUCT p=new PRODUCT(ID, NAME,PRICE, COLOR, SIZE , REPERTORY);
			//��ӵ�����
			lp.add(p);
		}
		for (PRODUCT s : lp) {
			System.out.println();
			System.out.print(s.getID()+"\t");
			System.out.print(s.getNAME()+"\t");
			System.out.print(s.getPRICE()+"\t");
			System.out.print(s.getCOLOR()+"\t");
			System.out.print(s.getSIZE()+"\t");
			System.out.print(s.getREPERTORY()+"\t");
		}
	}
}

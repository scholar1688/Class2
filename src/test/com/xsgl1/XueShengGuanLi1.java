/*
 * JTable��ʹ��
 */
package test.com.xsgl1;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class XueShengGuanLi1 extends JFrame {
	//rawData���������
	//columnNames�������
	Vector rawData,columnNames;
	JTable jt=null;
	JScrollPane jsp=null;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		XueShengGuanLi1 XueShengGuanLi1=new XueShengGuanLi1();
	}
	public XueShengGuanLi1()
	{
		columnNames=new Vector();
		//��������
		columnNames.add("ѧ��");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("ϵ��");
		
		//rawData���Դ�Ŷ���
		rawData=new Vector();
		Vector hang=new Vector();
		hang.add("s001");
		hang.add("�����");
		hang.add("��");
		hang.add("500");
		hang.add("����ɽ");
		hang.add("������");
		rawData.add(hang);
		
		//��ʼ��JTable
		jt=new JTable(rawData,columnNames);
		jsp=new JScrollPane(jt);
		this.add(jsp);
		
		this.setTitle("ѧ������ϵͳ");
		this.setLocation(500, 200);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

/*
 * �����ݿ���ȡ��ѧ����Ϣ
 */
package test.com.xsgl1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
public class XueShengGuanLi2 extends JFrame{
	//����һЩ�ؼ�
	JPanel jp1,jp2;
	JLabel jl1;
	JTextField jtf;
	JButton jb1,jb2,jb3,jb4;
	JTable jt;
	JScrollPane jsp;
	Vector rowData,columnNames;
	//����������ݿ���Ҫ�Ķ���
	PreparedStatement ps=null;
	Connection ct=null;
	ResultSet rs=null;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		XueShengGuanLi2 XueShengGuanLi2=new XueShengGuanLi2();
	}
	public XueShengGuanLi2()
	{
		jp1=new JPanel();
		jl1=new JLabel("���������֣�");
		jtf=new JTextField(10);
		jb1=new JButton("��ѯ");
		
		//�ѿؼ��ӵ�jp1��ȥ
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jb1);
		
		jp2=new JPanel();
		jb2=new JButton("����");
		jb3=new JButton("�޸�");
		jb4=new JButton("ɾ��");
		
		//�ѿؼ��ӵ�jp2��ȥ
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		
		//�м�
		columnNames=new Vector();
		//��������
		columnNames.add("ѧ��");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("ϵ��");
		
		//rawData���Դ�Ŷ���
		rowData=new Vector();
		try {
			//��������
			Class.forName()
			ct=delivermanage.
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			
		}
		
		//��ʼ��JTable
		jt=new JTable(rowData,columnNames);
		jsp=new JScrollPane(jt);
		this.add(jsp);
		this.add(jp1,"North");
		this.add(jp2,"South");
	
		
		this.setTitle("ѧ������ϵͳ");
		this.setLocation(500, 200);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}

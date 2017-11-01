/*
 * 从数据库中取出学生信息
 */
package test.com.xsgl1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
public class XueShengGuanLi2 extends JFrame{
	//定义一些控件
	JPanel jp1,jp2;
	JLabel jl1;
	JTextField jtf;
	JButton jb1,jb2,jb3,jb4;
	JTable jt;
	JScrollPane jsp;
	Vector rowData,columnNames;
	//定义操作数据库需要的东东
	PreparedStatement ps=null;
	Connection ct=null;
	ResultSet rs=null;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		XueShengGuanLi2 XueShengGuanLi2=new XueShengGuanLi2();
	}
	public XueShengGuanLi2()
	{
		jp1=new JPanel();
		jl1=new JLabel("请输入名字：");
		jtf=new JTextField(10);
		jb1=new JButton("查询");
		
		//把控件加到jp1里去
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jb1);
		
		jp2=new JPanel();
		jb2=new JButton("增加");
		jb3=new JButton("修改");
		jb4=new JButton("删除");
		
		//把控件加到jp2里去
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		
		//中间
		columnNames=new Vector();
		//设置列名
		columnNames.add("学号");
		columnNames.add("名字");
		columnNames.add("性别");
		columnNames.add("年龄");
		columnNames.add("籍贯");
		columnNames.add("系别");
		
		//rawData可以存放多行
		rowData=new Vector();
		try {
			//加载驱动
			Class.forName()
			ct=delivermanage.
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			
		}
		
		//初始化JTable
		jt=new JTable(rowData,columnNames);
		jsp=new JScrollPane(jt);
		this.add(jsp);
		this.add(jp1,"North");
		this.add(jp2,"South");
	
		
		this.setTitle("学生管理系统");
		this.setLocation(500, 200);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}

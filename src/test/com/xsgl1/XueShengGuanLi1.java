/*
 * JTable的使用
 */
package test.com.xsgl1;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class XueShengGuanLi1 extends JFrame {
	//rawData存放行数据
	//columnNames存放列名
	Vector rawData,columnNames;
	JTable jt=null;
	JScrollPane jsp=null;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		XueShengGuanLi1 XueShengGuanLi1=new XueShengGuanLi1();
	}
	public XueShengGuanLi1()
	{
		columnNames=new Vector();
		//设置列名
		columnNames.add("学号");
		columnNames.add("名字");
		columnNames.add("性别");
		columnNames.add("年龄");
		columnNames.add("籍贯");
		columnNames.add("系别");
		
		//rawData可以存放多行
		rawData=new Vector();
		Vector hang=new Vector();
		hang.add("s001");
		hang.add("孙悟空");
		hang.add("男");
		hang.add("500");
		hang.add("花果山");
		hang.add("少林派");
		rawData.add(hang);
		
		//初始化JTable
		jt=new JTable(rawData,columnNames);
		jsp=new JScrollPane(jt);
		this.add(jsp);
		
		this.setTitle("学生管理系统");
		this.setLocation(500, 200);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

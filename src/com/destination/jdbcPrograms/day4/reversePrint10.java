package com.destination.jdbcPrograms.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class reversePrint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/BABY";
			String user="root";
			String pwd="Navyajyothi@20";
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Established");
			String sql="select * from student";
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery(sql);
			rs.afterLast();
			while (rs.previous()) {
				System.out.print(rs.getInt(1)+"--");
				System.out.println(rs.getString(2));
				System.out.println("-------------");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
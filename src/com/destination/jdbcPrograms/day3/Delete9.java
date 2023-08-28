package com.destination.jdbcPrograms.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/BABY";
			String user="root";
			String pwd="Navyajyothi@20";
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Established");
			String sql="delete from student where id=?";
			Scanner sc=new Scanner(System.in);
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter the id: ");
			ps.setInt(1, sc.nextInt());
			int x= ps.executeUpdate();
			if (x>0) {
				System.out.println("Deleted");
			}
			else {
				System.out.println("Deletion Failed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
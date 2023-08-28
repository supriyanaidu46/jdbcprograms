package com.destination.jdbcPrograms.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertOneData4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/BABY";
			String user="root";
			String pwd="Navyajyothi@20";
			Connection con=DriverManager.getConnection(url,user,pwd);
			String sql =("Insert into student value(?,?)");
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("Enter the id:");
			pst.setInt(1,sc.nextInt());
			System.out.println("Enter the name:");
			pst.setString(2,sc.next());
			int x= pst.executeUpdate();
			if(x>0)
			{
				System.out.println("Data added");
			}
			else
			{
				System.out.println("Data Addition failed");
			}
			pst.close();
			con.close();
			sc.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
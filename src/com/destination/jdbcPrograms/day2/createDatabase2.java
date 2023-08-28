package com.destination.jdbcPrograms.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class createDatabase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/jdbccodes";
			String user="root";
			String pwd="Navyajyothi@20";
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("enter the database name: ");
			java.sql.Statement stmt= con.createStatement();
			int x=stmt.executeUpdate("create database "+sc.next());
			if (x>0) {
				System.out.println("Database Created");
			}
			else {
				System.out.println("Database connection failed");
			}
			stmt.close();
			con.close();
			sc.close();
		}
		catch(Exception e){
			System.out.println("Exception Caught");
		}

	}

}
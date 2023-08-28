package com.destination.jdbcPrograms.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class fetchingAllData6 {

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
			String query="Select * from student";
			java.sql.Statement st =con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while (rs.next()!=false) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("-----------------");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
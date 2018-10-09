package com.codefactory.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codefactory.util.Preferences;


public class SchoolManager {
	
	Connection con = null;
	
	public SchoolManager(){
		
	
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = DriverManager.getConnection(Preferences.CONNECTION_STRING + 
												  Preferences.DATABASE_NAME,
												  Preferences.USER_LOGIN,
												  Preferences.USER_PASSWORD);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public List<Department> getDepartments(){
		List<Department> departments = null;
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(Preferences.SELECT_ALL_DEARTMENTS);
			while(res.next()) {
				if(departments == null) {
					departments = new ArrayList<Department>();
				}
				Department d = new Department();
				d.setNumDept(res.getInt("numDept"));
				d.setNameDept(res.getString("nameDept"));
				
				departments.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return departments;
		
	}
	
	public void addDepartment(String name) {
		try {
			PreparedStatement stmt = con.prepareStatement(Preferences.INSERT_NEW_DEPARTMENT);
			stmt.setString(1, name);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

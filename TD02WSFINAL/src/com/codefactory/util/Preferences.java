package com.codefactory.util;

public class Preferences {
	public static String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";
	public static String DATABASE_NAME = "test_db";
	public static String USER_LOGIN = "root";
	public static String USER_PASSWORD = "password2017";
	
	public static String SELECT_ALL_STUDENTS = "SELECT * FROM student";
	public static String SELECT_ALL_DEARTMENTS = "SELECT * FROM department";
	public static String INSERT_NEW_DEPARTMENT = "INSERT INTO department(nameDept) values(?)";
	public static String INSERT_NEW_STUDENT = "INSERT INTO student( numStud, nameStud, numDept) values( ?, ?, ?)";
	public static String INSERT_NEW_STUDENT2 = "INSERT INTO student( nameStud, numDept) values( ?, ?)";
	public static String DELETE_STUDENT = "DELETE FROM student WHERE numStud = ?";
}


package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
	public void save(Employee employee) {
		String query = "INSERT INTO EMPLOYEE VALUES(?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getCity());
			ps.executeQuery();
			}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(Employee employee) {
		String query = "update EMPLOYEE set city='Chennai' where city=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, employee.getCity());
			int i=ps.executeUpdate();
			System.out.println("rows updated"+i);
			}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void saveList(List<Employee> employee) {
		String query = "INSERT INTO EMPLOYEE VALUES(?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int i=0;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			for (Employee employee2 : employee) {
				ps.setString(1, employee2.getName());
				ps.setString(2, employee2.getCity());
				i+=ps.executeUpdate();
				
			}
			System.out.println("rows updated"+i);
			}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
}

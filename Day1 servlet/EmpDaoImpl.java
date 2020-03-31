package com.sonata.Daolmpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.DAO.EmpDao;
import com.sonata.Model.Employee;

public class EmpDaoImpl  implements EmpDao{
	int row = 0;
	DbConnection db = new DbConnection();
		Employee employee = null;
		
		
		
			public int save(Object object ) {
				try {
					employee = (Employee)object;
					PreparedStatement cs = db.getConnection().prepareStatement("insert into Employee values (?,?,?)");
					cs.setInt(1, employee.getEmpId());
					cs.setString(2, employee.getEmpName());
					cs.setString(3, employee.getEmpSal());
					
					row = cs.executeUpdate();
					db.closeConnection();
				} catch(SQLException e) {System.out.println(e);}
				return row;
	}
			
			
			public List<Employee> getData() {
				List l1 =new  ArrayList<Employee>();
				try
				{
					PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement("SELECT * FROM Employee");
					ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{ 
					Employee emp= new Employee();
					int eid=rs.getInt(1);
					String name = rs.getString(2);
					String sal= rs.getString(3);
					emp.setEmpId(eid);
					emp.setEmpName(name);
					emp.setEmpSal(sal);
					l1.add(emp);
				}
				
			}
				catch (SQLException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				
				
				return l1;
			}





			
			
			
			
}

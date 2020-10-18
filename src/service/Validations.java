package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import utility.ConnectionManager;
import model.Admin;

public class Validations implements Interfaces {

	@Override
	public boolean LoginAdmin(Admin admin) {
	
		boolean result= false;
		
		try {
			Connection con= ConnectionManager.getConnection();
			String sql="select * from admin";
			Statement st=con.createStatement();
			ResultSet rs =st.executeQuery(sql);
			
		
			if(admin.getUsername().equalsIgnoreCase(rs.getString("admin_username"))&&admin.getPassword().equalsIgnoreCase(rs.getString("admin_password")))
			{
				result=true;
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}

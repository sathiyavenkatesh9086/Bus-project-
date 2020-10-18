package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectionManager;
import model.Bus;

public class Busdao {

	public static void insertFood(Bus buse) throws Exception {
		// TODO Auto-generated method stub
		Connection con=ConnectionManager.getConnection();
		
		String sql="Insert into buse(bus_id,bus_type,bus_startingpoint,bus_destination)VALUES(?,?,?,?)";
		PreparedStatement st= con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		st.setInt(1, buse.getBus_id());
		st.setString(2, buse.getBus_type());
		st.setString(3,buse.getBus_starting());
		st.setString(4, buse.getBus_destination());
		
		int rowInserted=st.executeUpdate();
		if(rowInserted>0)
		{
			System.out.println("inserted successfully");
		}
		else
		{
			System.out.println("not inserted");
		}
		con.close();
	}
public void deleteBus(int bus_id) throws Exception
{
	Connection con=ConnectionManager.getConnection();
	PreparedStatement st= con.prepareStatement("DELETE from bus where bus_id=?");
	st.setInt(1, bus_id);
	int rowDeleted=st.executeUpdate();
	if(rowDeleted>0)
	{
		System.out.println("Deleted successfully");
	}
	else
	{
		System.out.println("not deleted");
	}
	con.close();
	
}
public void updateBus(int bus_id) throws Exception
{
	Connection con=ConnectionManager.getConnection();
	PreparedStatement st= con.prepareStatement("Update Bus set bus_type=?,bus_startingpoint=?,bus_destination=? WHERE bus_id=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("Edit bus type");
	String bus_type=sc.next();
	System.out.println("Edit bus starting point");
	String bus_startingpoint=sc.next();
	System.out.println("Edit bus destination point");
	String bus_destination=sc.next();
	st.setString(1,bus_type);
	st.setString(2, bus_startingpoint);
	st.setString(3, bus_destination);
	st.setInt(4,bus_id);
	
	int rowUpdated=st.executeUpdate();
	if(rowUpdated>0)
	{
		System.out.println("Updated successfully");
	}
	else
	{
		System.out.println("Not Updated");
	}
	con.close();
	
}
public void viewAllBusDetails() throws Exception
{
	Connection con=ConnectionManager.getConnection();
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery("SELECT * FROM bus");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"t"+rs.getString(2)+"t"+rs.getString(3)+"t"+rs.getString(4));
	}
			
}
}


package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.Busdao;
import service.Validations;
import model.Admin;
import model.Bus;

public class Main {
	public static void main(String[] args) throws Exception {
     System.out.println("Transport project");
     
     while(true)
     {
    	 System.out.println("1.Admin");
    	 System.out.println("2.User");
    	 System.out.println("3.logout");
    	 
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 int temp=Integer.parseInt(br.readLine());
    	 String username,password;
    	 Admin admin = new Admin();
    	 Validations validate =new Validations();
    	 Buss buss=new Buss();
    	
    	 switch(temp)
    	 {
    	 case 1: System.out.println("enter username");
    	 username=br.readLine();
    	 System.out.println("enter password");
    	 password=br.readLine();
    	 admin.setUsername(username);
    	 admin.setPassword(password);
    	 boolean validateAdmin=validate.LoginAdmin(admin);
    	 if(validateAdmin)
    	 {
    		 System.out.println("login successful");
    	 buss.admin();
    	 }
    	 else
    	 {
    		 System.out.println("Check your id and password");
    	 }
    	 break;
    	 case 2:
    		Busdao busdao = new Busdao();
    		busdao.viewAllBusDetails();
    		break;
    	 }
     }

	}

}
class Buss{
	void admin() throws Exception{
		int temp;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("1.Bus type");
			System.out.println("2.Bus category");
		temp=sc.nextInt();
		switch(temp)
		{
		case 1:
			bus();
			break;
		}
		}while(temp!=2);
		
	}
	void bus() throws Exception
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add bus type");
		System.out.println("2.Delete bus type");
		System.out.println("3.Update bus type");
		System.out.println("4.View bus type");
		System.out.println("5.Exit");
		temp=sc.nextInt();
		Busdao  busdao = new Busdao();

		switch(temp)
		{
		case 1:
			System.out.println("Enter bus details");
			System.out.println("---------------------");
			System.out.println("Enter bus id");
			int bus_id=sc.nextInt();
			System.out.println("Enter bus type");
			String bus_type=sc.next();
			System.out.println("Enter bus starting point");
			String bus_startingpoint=sc.next();
			System.out.println("Enter bus destination");
			String bus_destination=sc.next();
			
			Bus buse=new Bus(bus_id,bus_type,bus_startingpoint,bus_destination);
			busdao.insertFood(buse);
			break;
			
		case 2:
			System.out.println("Delete bus details");
			System.out.println("---------------------");
			System.out.println("Enter bus id");
			bus_id=sc.nextInt();
			busdao.deleteBus(bus_id);
			break;
			
		case 3:
			System.out.println("Update bus details");
			System.out.println("---------------------");
			System.out.println("Enter bus id");
			bus_id=sc.nextInt();
		    busdao.updateBus(bus_id);
		    break;
		    
		    case 4:
		    	busdao.viewAllBusDetails();
		    	break;
	}
	}
		    	
	}



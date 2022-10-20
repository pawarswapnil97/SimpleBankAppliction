package com.Application;

import java.util.ArrayList;
import java.util.Scanner;


public class BankAccount1 {
	private int accono;
	private static int saccno=1001;
	private String name;
	private String city;
	private int bal;
	
//	constructor
	public BankAccount1(String name, String city, int bal) {
		
		this.name = name;
		this.city = city;
		this.bal = bal;
		this.accono=saccno++;
	}

//	getter and setter
	public int getAccono() {
		return accono;
	}

	public void setAccono(int accono) {
		this.accono = accono;
	}

	public static int getSaccno() {
		return saccno;
	}

	public static void setSaccno(int saccno) {
		BankAccount1.saccno = saccno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

//	To String method
	@Override
	public String toString() {
		return "[accono=" + accono + ", name=" + name + ", city=" + city + ", bal=" + bal + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name,city;
		int accno,amt;
		
		//  Anonymous object
		ArrayList<BankAccount1> list = new ArrayList<>();
			list.add(new BankAccount1("Swapnil","Ahmednagar",15000));
			list.add(new BankAccount1("Kolate","Mumbai",8000));

		
		System.out.println("Select Oprations");
		System.out.println("1. Open account");
		System.out.println("2. Deposit");
		System.out.println("3. Withraw");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. List All");
		System.out.println("6. Exit");
		
		int choice;
		boolean found;
		do
		{
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("---- Account Open ---- ");
					System.out.print("Enter Name : ");
					name=sc.next();
					System.out.print("Enter City : ");
					city=sc.next();
					System.out.print("Enter amount : ");
					amt=sc.nextInt();
					BankAccount1 acc=new BankAccount1(name,city,amt);
					list.add(acc);
					System.out.println("Account Opened..!!");
					break;
			case 2:
					System.out.println("---- Account Deposit ---- ");
					found=false;
					System.out.print("Enter account No : ");
					accno=sc.nextInt();
					for(BankAccount1 ac : list)
					{
						if(accno==ac.getAccono())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balence "+ac.getBal());
							
							System.out.print("\nEnter Amount to Deposite : ");
							amt=sc.nextInt();
							ac.setBal(ac.getBal()+amt);
							System.out.println("Deposite Successfully..!!");
							break;
							
						}
					}
					if(!found)
					{
						System.out.println("Invalid account number..!!");
					}
					break;
			case 3:
					System.out.println("---- Account Withraw ---- ");
					found=false;
					System.out.print("Enter account No : ");
					accno=sc.nextInt();
					for(BankAccount1 ac : list)
					{
						if(accno==ac.getAccono())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balence "+ac.getBal());
							
							System.out.print("\nEnter Amount to Withraw : ");
							amt=sc.nextInt();
							if(amt<=ac.getBal())
							{
								ac.setBal(ac.getBal()-amt);
								System.out.println("Withraw Successfully..!!");
							}
							else
							{
								System.out.println("Insufficient Balance..!!");
							}
							break;
							
						}
					}
					if(!found)
					{
						System.out.println("Invalid account number..!!");
					}
					break;
			case 4:
					System.out.println("---- Balance Enquiry ---- ");
					found=false;
					System.out.print("Enter account No : ");
					accno=sc.nextInt();
					for(BankAccount1 ac : list)
					{
						if(accno==ac.getAccono())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balence "+ac.getBal());
							break;
							
						}
					}
					if(!found)
					{
						System.out.println("Invalid account number..!!");
					}
					break;
			case 5:
				System.out.println("---- list all ---- ");
				for(BankAccount1 ac : list)
				{
					System.out.println(ac);
				}
				break;
			case 6:
					System.out.println("---- Thank for visiting Us..!! ---- ");
					break;
			default:
					System.out.println("---- Invalid choice ---- ");
					break;
				
			}
		}while(choice!=6);
		

	}

}

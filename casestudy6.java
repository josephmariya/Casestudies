package main1;

import java.util.Scanner;

public class casestudy6 {
	public static void main(String args[])

	{
	Scanner ob=new Scanner(System.in);
	int r;
	int id=1;
	int i=1;
	String op1,op4;
	String ac,cot,cable,wifi,laundry;
	int date=0,sdate,edate;
	casestudy6b c[]=new casestudy6b[20];
	
do
{		
	System.out.print("1.Registration\n2.View\n3.Exit\n---->");
	r=ob.nextInt();
	switch(r)
	{
	case 1:
		do
		{
		System.out.println("------Registration-----\n\n\n");	
	System.out.println("Enter your name:");
	String n=ob.next();
	System.out.println("Enter your address:");
	String a=ob.next();
	System.out.println("Contact Number:");
	String p=ob.next();
	System.out.println("Email ID:");
	String e=ob.next();
	System.out.println("Enter proof type:");
	String pt=ob.next();
	System.out.println("Enter proof id:");
	String pi=ob.next();
	c[i]=new casestudy6b();
	c[i].register(id,n,a,p,e,pt,pi);
	System.out.println("Thank you for registering.Your id is :"+id);
	i++;
	id++;
	System.out.println("Do you want to continue registration(y?n)");
	op4=ob.next();
		}while((op4.equals("y"))||(op4.equals("Y")));
	break;
	case 2:
		System.out.println("\n-----Customer List-----");
		System.out.println("\n-----Registered Customers are-----\n");
		System.out.println("\nCustomer_ID\t\tCustomer_Name\n");
		for(int j=1;j<i;j++)
		{
			c[j].viewdetails();
		}
		break;
	case 3:
		System.exit(0);
	}
	 System.out.println("Do you want to continue (yes/no)");
        op1=ob.next();
}while((op1.equals("yes"))||(op1.equals("YES")||(op1.equals("Yes"))));
       

}
}

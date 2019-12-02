package main1;
import java.util.Scanner;
import java.lang.NullPointerException;
public class casestudy5main {
	
	public static void main(String args[]) throws NullPointerException

	{
	Scanner ob=new Scanner(System.in);
	int r;
	int roomid=1;
	String op1,op2,op3,op4;
	String ac,cot,cable,wifi,laundry;
	int date=0,sdate,edate;
	casestudy4 c[]=new casestudy4[20];
	casestudy5booking c2[]=new casestudy5booking[30];
	int i=0;
	int l=0;
	int id=1001;
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
	c[i]=new casestudy4();
	c[i].register(id,n,a,p,e,pt,pi);
	System.out.println("Thank you for registering.Your id is :"+id);
	System.out.println("Do you want to book a room(y?n)");
	op2=ob.next();
	if(op2.contentEquals("y")||op2.contentEquals("Y"))
	{
		
		System.out.println("---Please choose the services required---\n");
		ob.nextLine();
		System.out.println("AC or NONAC(Ac/nAC) :\n");
	    ac=ob.nextLine();
		System.out.println("Cot(Single/Double)");
		cot=ob.nextLine();
		System.out.println("with cable connection/without cable connection(C/nC)");
		cable=ob.nextLine();
		System.out.println(" wifi neede or not(W/nW)");
		wifi=ob.nextLine();
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=ob.nextLine();
		System.out.println(" Enter the date of booking:");
		date=ob.nextInt();
		c2[i]=new casestudy5booking();
		c2[i].book(id,ac,cot,cable,wifi,laundry,roomid,date);
		//l++;
		System.out.println("Do you want to proceed(y?n)");
		op3=ob.next();
		if(op3.contentEquals("y")||op3.contentEquals("Y"))
		  System.out.println("Thank you for Booking. Your Room Number is "+(roomid));
		roomid++;
	}
	else
	{
		System.out.println("Thank you");
	}
	i++;
	id++;
	System.out.println("Do you want to continue registration(y?n)");
	op4=ob.next();
		}while((op4.equals("y"))||(op4.equals("Y")));
	break;
	case 2:
		System.out.println("-----View all bookings----");
		System.out.println(" Enter the start date");
		sdate=ob.nextInt();
		System.out.println(" Enter the end date");
		edate=ob.nextInt();
		System.out.print("The booking made from "+sdate+"to"+edate+"are \n");	
		System.out.print("Room no\t\tCustomerID \n");
		for(int j=0;j<i;j++)
		{
			//System.out.println(c2[j].date);
			//System.out.println(sdate);
			//System.out.println(edate);
			if((c2[j].date>=sdate)&&(c2[j].date<=edate))
			{
		        c2[j].view();
		        System.out.println();
			}
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


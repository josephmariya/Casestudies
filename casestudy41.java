package main1;
import java.util.Scanner;
public class casestudy41 {
	
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int r;
		String op1,op2;
		casestudy4 c[]=new casestudy4[20];
		int i=0;
		int id=1001;
	do
	{		
		System.out.print(".1Registration\n.2Update mail\n3.Exit\n---->");
		r=ob.nextInt();
		switch(r)
		{
		case 1:
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
		i++;
		id++;
		break;
		case 2:
			 int k=0;
	    	 System.out.println("--Update Email--");
	    	 System.out.println("Enter reg_ID :");
	    	 int rid=ob.nextInt();
	    	 for(int j=0;j<i;j++)
	    	 {
	    		 if(c[j].id==rid)
	    		 {
	    			 System.out.println("Enter new Email ID :");
	    	    	 e=ob.next();
	    		     c[j].update(e);
	    		     System.out.println("Email Updated");
	    		     c[j].display();
	    		     k=1;
	    		     break;
	    		 }
	    	 }
	    	 if(k==0)
	    	 {
	    		 System.out.println("Invalid registration id");
	    	 }
	    	 break;
		case 3:
			System.exit(0);
		}
		 System.out.println("Do you want to continue (yes/no)");
	        op1=ob.next();
	}while((op1.equals("yes"))||(op1.equals("YES")||(op1.equals("Yes"))));
	        //{
	       // }
	        //else
	       // {
		// System.out.println("Do you want to update the mail id?(yes/no)");
	    // op2=ob.next();
	     //if(op2.equals("yes")||op2.equals("YES"))
	     //{
	    	}
	    	 
	     }
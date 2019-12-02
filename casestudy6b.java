package main1;

import java.util.Scanner;

public class casestudy6b {
	int id;
	String name;
	String address;
	String ph;
	String email;
	String ptype;
	String pid;
	public void register(int id,String n,String a,String p,String e,String pt,String pi)
	{
		Scanner ob=new Scanner(System.in);
		String op1,op2;
		this.name=n;
		this.address=a;
		this.ph=p;
		this.email=e;
		this.ptype=pt;
		this.pid=pi;
		this.id=id;
	}
    void viewdetails()
    {
     System.out.println(" "+id+"\t\t\t"+name);
    }
}

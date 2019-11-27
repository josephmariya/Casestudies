package main1;

import java.util.Scanner;
public class casebooking {

	String ac,cot,cable,wifi,laundry;
	int booked[]=new int[25];
	void book(String ac,String cot,String cable,String wifi,String laundry,int c)
	{
		booked[c]=1;
		System.out.print("The Services chosen are \n");
		float tot=0.0f;
		
		if(cot.contentEquals("Double"))
		{
			tot=tot+350;
			this.cot="Double cot";
		}
		else
			this.cot="Single cot";
		
		if(ac.contentEquals("AC"))
		{
			tot=tot+1000;
			this.ac="AC Room";
		}
		else if(ac.contentEquals("nAC"))
		{
			tot=tot+750;
			this.ac="Non-AC Room";
		}
		if(cable.contentEquals("C"))
		{
			tot=tot+50;
			this.cable="Cable Connection Enabled";
		}
		else
			this.cable="Cable Connection Disabled";
		if(wifi.contentEquals("W"))
		{
			tot=tot+200;
			this.wifi="WiFi Connection Enabled";
		}
		else
			this.wifi="WiFi Connection Disabled";
		if(laundry.contentEquals("C"))
		{
			tot=tot+100;
			this.laundry="With Laundry Service";
		}
		else
			this.laundry="With out Laundry Service";
		
		System.out.println("The total charge is Rs."+tot+"\n");	
		System.out.print(this.cot+" ");
		System.out.println(this.ac);
		System.out.println(this.cable);
		System.out.println(this.wifi);
		System.out.println(this.laundry);
	}
	int check(int c)
	{
		return booked[c];
	}

}




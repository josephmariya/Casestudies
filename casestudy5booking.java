package main1;
import java.util.Scanner;

public class casestudy5booking {
	public String ac,cot,cable,wifi,laundry;
	public int id,roomid;
	int date;
	int booked[]=new int[25];
	void book(int id,String ac,String cot,String cable,String wifi,String laundry,int roomid,int date)
	{
		this.date=date;
		this.id=id;
		this.roomid=roomid;
		//booked[c]=1;
		System.out.print("The Services chosen are \n");
		float tot=0.0f;
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
		if(cot.contentEquals("Double"))
		{
			tot=tot+350;
			this.cot="Double cot";
		}
		else
			this.cot="Single cot";
		
		
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
		if(laundry.contentEquals("L"))
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
		System.out.println(this.date);
	}
	void view()
	{
		System.out.print(this.id+"\t\t"+this.roomid);
		
	}
	}



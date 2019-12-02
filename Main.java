import java.util.Scanner;
public class Main {
	static String ac;
	static String cot;
	static String cable;
	static String wifi;
	static String laundry;
	public Main(String ac,String cot,String cable,String wifi,String laundry)
	{
	  this.ac=ac;
	  this.cot=cot;
	  this.cable=cable;
	  this.wifi=wifi;
	  this.laundry=laundry;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String c;
		float charge1=0,charge2=0,charge3=0,charge4=0,charge5=0;
	    String s1="",s2="",s3="",s4="",s5="";
		do
		{
	    
		System.out.println("Please choose the services required :\n");
		System.out.println("AC or NONAC(Ac/nAC) :\n");
		String ac=obj.nextLine();
		System.out.println("Cot(Single/Double)");
		String cot=obj.nextLine();
		System.out.println("with cable connection/without cable connection(C/nC)");
		String cable=obj.nextLine();
		System.out.println(" wifi neede or not(W/nW)");
		String wifi=obj.nextLine();
		System.out.println("Laundry service needed or not(L/nL)");
		String laundry=obj.nextLine();
		if(ac.equals("Ac"))
		{
			charge1=1000;
			s1="AC room";
		}
		else if(ac.equals("nAc"))
		{
			
			charge1=750;
			s1="Non AC room";
		}
		if(cot.equals("Single"))
		{
			charge2=1000;
			s2="Single cot";
		}
		else if(cot.equals("Double"))
		{
			charge2=750;
			s2="Double cot";
		}
		if(cable.equals("C"))
		{
			charge3=50;
			s3="Cable connection enabled";
		}
		else if(cable.equals("nC"))
		{
			charge3=0;
			s3="Cable connection disabled";
		}
		if(wifi.equals("W"))
		{
			charge4=200;
			s4="Wifi enabled";
		}
		else if(wifi.equals("nW"))
		{
			charge4=0;
			s4="Wifi disabled";
		}
		if(laundry.equals("L"))
		{
			charge5=100;
			s5="With laundry service";
		}
		else if(laundry.equals("nL"))
		{
			charge5=0;
			s5="Without laundry service";
		}
		float total=(float)(charge1+charge2+charge3+charge4+charge5);
		System.out.println("The total charge is Rs."+total);
		System.out.println("\nServices chosen are");
		System.out.println(s2+s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("Do you want to proceed(yes/no)");
		c=obj.nextLine();
		}
		while(c.equals("no"));
		Main f=new Main(ac,cot,cable,wifi,laundry);
		f.book();

	}
	public void book()
	{
		int i=0;
	  System.out.println("Thank you for booking.Your id is "+(++i));
	}


}

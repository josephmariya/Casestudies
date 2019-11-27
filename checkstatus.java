package main1;

import java.util.Scanner;
public class checkstatus {
	private static Scanner ob;
	private static String op;

	public static void main(String[] args)
	{
		int c=1;
		casebooking window = new casebooking();
					op = null;
					int rn,op2;
					String ac,cot,cable,wifi,laundry;
					ob = new Scanner(System.in);
					do
					{
						System.out.println("Select your Needs\n1.Booking\n2.Check Status\n3.Exit\n---->");
						op2=ob.nextInt();
				switch(op2)
				{
				case 1:
					System.out.println("Booking:");
					//do
					//{
						System.out.println("Please choose the services required\n.AC/non-AC (Enter AC/nAC) :");
						ac=ob.next();
						System.out.println(".Cot(Enter Single/Double) :");
						cot=ob.next();
						System.out.println(".With cable connection/without cable connection(Enter C/nC) :");
						cable=ob.next();
						System.out.println(".Wi-Fi needed or not(Enter W/nW) :");
						wifi=ob.next();
						System.out.println(".Laundry service needed or not(Enter L/nL) :");
						laundry=ob.next();
						window.book(ac, cot, cable, wifi, laundry,c);
						c++;
						//System.out.println("Do you want to continue(Y/N||y/n : ");
						//op=ob.next();
					//}//while(op.charAt(0)=='y'||op.charAt(0)=='Y');
						System.out.println("Thank you for Booking Your Room Number is "+(c-1));
						break;
				case 2:
					System.out.println("Check Ststus");
					System.out.println("Enter Room number :");
					rn=ob.nextInt();
					if(rn<=25)
					{
					int s=window.check(rn);
					if(s==1)
						System.out.println("Room Number "+rn+" is Booked");
					else
						System.out.println("Room Number "+rn+" is Not Booked");
					}
					else
						System.out.println("Room Number "+rn+" is Invalid");
					break;
				case 3:
					System.exit(0);
	}
			System.out.println("Do you want to proceed?(yes/no)");
			op=ob.next();
					}while(op.contentEquals("yes")||op.contentEquals("YES")||op.contentEquals("Yes"));
					}

}

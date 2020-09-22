import java.util.Scanner;

/*Problem Statement:
Electricity board wants to develop program to calculate Electricity Bill. They have two
types of connections domestic and commercial, charges for domestic bill are as follows
if consumed units are less or equals 100 then Rs.4/units or Rs. 250 whichever is greater
if consumed units are between 100 to 300 then Rs.4.50/units
if more than 300 and less than 500 Rs.4.75/units and above 500 Rs.5/units
For commercial connections charges are calculated as follows
Consumed units are less or equals 100 then Rs.4.25/units or Rs. 350 whichever is
greater.
if consumed units are between 100 to 300 then Rs.4.75/units.
if more than 300 and less than 500 Rs.5/units and above 500 Rs.5.25/units calculate
electricity bill.*/

public class ElectricityBoard {
	static float domestic(int units) {
		if(units <= 100) {
			int total=4*units;
			return (total>250?total:250);
		}
		else if(units <= 300)
			return (float) (4.50 * units);
		else if(units <=500)
			return (float) (4.75 * units);
		else
			return (float)(5*units);		
	}
	
	static float commercial(int units) {
		if(units <= 100) {
			float total= (float) (4.25*units);
			return (total>350?total:350);
		}
		else if(units <= 300)
			return (float) (4.75 * units);
		else if(units <=500)
			return (float) (5 * units);
		else
			return (float)(5.25*units);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of Connection: 1.Domestic 2. Commercial");
		System.out.println("Choose 1 or 2");
		int type = sc.nextInt();
		switch(type)
		{
		case 1:
			System.out.println("Enter units burned:");
			int units= sc.nextInt();
			float bill=domestic(units);
			System.out.println("Bill Amount: "+bill);
			break;
		case 2:
			System.out.println("Enter units burned:");
			int units1= sc.nextInt();
			float bill1=commercial(units1);
			System.out.println("Bill Amount: "+bill1);
			break;
			
		default :
			System.out.println("wrong choice");
			break;
	
		}
		sc.close();
	}

}

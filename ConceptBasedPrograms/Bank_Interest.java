import java.util.Scanner;

/*Problem Statement:
Develop a program, that accepts a deposit amount and calculates amount of interest
the deposit amount earns in a year. The bank pays a flat 4% interest for deposits of up
to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, and a flat 5% for deposits
of more than Rs.5000.

static double calInterest(int amt)*/

public class Bank_Interest {

	static double calInterest(int amt)
	{
		
		if(amt <= 1000)			
			return ((4.0/100)*amt);
		else if(amt<=5000 )
			return ((4.5/100)*(amt));
		else
			return ((5.0/100)*(amt));

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amount:");
		int amt=sc.nextInt();
		double iamount= calInterest(amt);
		System.out.print("Interest on "+amt+" is Rs "+iamount);
		sc.close();
		

	}

}

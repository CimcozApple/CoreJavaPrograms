import java.util.Scanner;

/*Problem Statement:
Develop the program, which accepts the gross pay and produces the amount of tax
owed. For a gross pay of $240 or less, the tax is 0%; for over $240 and less than
$480, the tax rate is 15%; and for any pay over $480, the tax rate is 28%.
static double calTax(int gp)
*/


public class Bank_Tax {
	static double calTax(int gp)
	{
		if(gp <= 240)			
			return 0.0;
		else if(gp <=480 )
			return ((15.0/100)*gp);
		else
			return (28.0/100)*gp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gross pay amount:");
		int amt=sc.nextInt();
		double tax= calTax(amt);
		System.out.print("Tax on "+amt+" is Rs "+tax);
		sc.close();
		

	}

}

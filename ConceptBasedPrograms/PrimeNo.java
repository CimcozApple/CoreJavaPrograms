import java.util.Scanner;

/*Problem Statement:
Find the number is prime or not.
static boolean isPrimeNumber( int num)*/

public class PrimeNo {
	static boolean isPrimeNumber( int num)
	{
		int num1 = num/2;
		for(int i=2;i<=num1;i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no:");
		int a = sc.nextInt();
		if(isPrimeNumber(a))
			System.out.print("The given no is Prime");
		else
			System.out.print("The given no is not Prime.");
		sc.close();

			
		
		
		
				
	}

}

/*
Problem Statement:
Method will accept range value and print all prime numbers from 2 to range on console.
void printPrime(int maxVal)*/

import java.util.Scanner;

public class PrimeNoInRange {
	static void printPrime(int maxVal)
	{
		
		for(int i=2; i <= maxVal;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i % j == 0)
					count+=1;			
			}
			if(count==2)
				System.out.print(i+"     ");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no:");
		int maxVal = sc.nextInt();
		System.out.println("Prime nos till "+maxVal);
		printPrime(maxVal);
		sc.close();
		
		
		
		
		
	}

}

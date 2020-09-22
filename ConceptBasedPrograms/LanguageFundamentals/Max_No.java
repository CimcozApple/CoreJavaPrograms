/*Problem Statement:
Find the maximum of three numbers 
static int calMax(int x,int y,int z)*/

import java.util.Scanner;
public class Max_No {
	
	static int calMax(int x,int y,int z)
	{
		int num1 = x>y?x:y;
		int num2 = num1>z?num1:z;
		return num2;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int x=sc.nextInt();
		System.out.println("Enter 2nd no:");
		int y=sc.nextInt();
		System.out.println("Enter 3rd no:");
		int z=sc.nextInt();
		
		int result = calMax(x, y, z);
		System.out.println("Maximum no is "+ result);
		sc.close();

	}

}

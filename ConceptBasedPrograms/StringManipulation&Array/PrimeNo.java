import java.util.Scanner;

/*
 * Problem Statement:
Write a function findPrime which will accept range of values from user and
 return int array from function and print all numbers from it*/
public class PrimeNo {
	static int[] findPrime(int start, int end)
	{
		int size=end-start;
		int[] array = new int[size];
		//try with array list also
		int k=0;
		for(int i=start; i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i; j++) {
				if(i%j == 0 )
					count++;				
			}
			if(count == 2)
				array[k++]=i;
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range:");
		int start= sc.nextInt();
		int end = sc.nextInt();
		int[] array = findPrime(start,end);
		for(int no:array)
		{
			if(no !=0)
			System.out.print(no+"  ");
		}
		sc.close();
	}

}

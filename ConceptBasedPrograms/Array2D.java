import java.util.Scanner;

/*Problem Statement:
Create a two dimensional character array which will accept only two characters X or O. populate
array with different combinations of X and O characters. If Same character appears at either
diagonal position or in the same line, return that character.

For eg.
X O O
O X O
O O X
X appears at diagonal position hence return X.*/

public class Array2D {
	static void input(String[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or O");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=sc.next();
			System.out.println();
		}
		sc.close();
		
	}
	static void display(String[][] arr) {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
	}
	static String check(String[][] arr) 
	{	
		
		//rows
		int sum=0;
		for(int i=0;i<3;i++)
		{
			int val;
			sum=0;
			for(int j=0;j<3;j++)
			{
				//row-wise
				if(arr[i][j] =="X")
					val=1;
				else
					val=0;
				sum+=val;
							
			}
			
		}
		if(sum==3)
			return "X";
		else
			return "O";	
	}
		
	public static void main(String[] args) {
		String[][] arr = new String[3][3];
		input(arr);
		display(arr);
		String character =check(arr);
		System.out.println("WINNER "+character);
	}
	


	

	
}

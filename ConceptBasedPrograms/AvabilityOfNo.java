import java.util.Scanner;

/*Problem Statement:
Write a program to find the availability of given number in the list. 
static int findPosition(int num,int[] nos)*/
public class AvabilityOfNo {
	static int findPosition(int num,int[] nos)
	{
		int loc = -1;
		for(int i=0;i<nos.length;i++)
		{
			if(num == nos[i])
				return loc=i;
				
		}
		return loc;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int size = sc.nextInt();
		int[] nos = new int[size];
		for(int i=0;i<nos.length;i++)
		{
			System.out.println("Enter no in list");
			nos[i]=sc.nextInt();
		}

		System.out.println("Enter the number to find:");
		int num =sc.nextInt();
		int loc = findPosition(num, nos);
		if(loc != -1)
		System.out.println("No is present at location : "+loc);
		else
			System.out.println("No is not present in list");
		
		sc.close();			
	}

}

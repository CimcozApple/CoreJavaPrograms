import java.util.Scanner;

/*Problem Statement:
Write a program that will reverse the sequence of letters in each word of a chosen
paragraph . For instance, &quot; To be or not to be &quot; Would become &quot; oT eb ro ton ot eb&quot;
static String makeReverse(String str)*/
public class ReverseWord {
	
	static String makeReverse(String str) {
		String[] arr = str.split(" ");
		String reverse = "";
		for(int i=0;i<arr.length ;i++)
		{
			StringBuilder sb=new StringBuilder(arr[i]);  
	        sb.reverse();  
	        reverse +=sb.toString()+" "; 
		}
		return reverse;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		str = makeReverse(str);
		System.out.println("Reverse String :" + str);
		sc.close();
	}

}

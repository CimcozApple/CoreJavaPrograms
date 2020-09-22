import java.util.Scanner;

/*Problem Statement:
Ezee Shop has an online portal where customers can check about different products.
Customers can search for products by giving a key word. Write a program that
accepts a product name and a key word, and checks if the key word is present in the
given product name.
static String[] initProductNames()
static boolean isPresent(String[] productNames, String keyword)*/
public class OnlinePortal {

	static String[] initProductNames()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many product?:");
		int size = sc.nextInt();
		String[] productNames = new String[size];
		for(int i=0;i<productNames.length;i++)
		{
			productNames[i]=sc.next();
		}
		sc.close();
		
		return productNames;
		
	}
	static boolean isPresent(String[] productNames, String keyword)
	{
		for(int i=0;i<productNames.length;i++)
		{
				if(productNames[i].contains(keyword))
				{
					return true;
				}
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key:");
		String key1 = sc.next();
		String[] productNames = initProductNames();
		
		boolean val=isPresent(productNames, key1);
		if(val)
			System.out.println("Product list contains given keyword");
		else
			System.out.println("No Product with given keyword");
		sc.close();
	}
}

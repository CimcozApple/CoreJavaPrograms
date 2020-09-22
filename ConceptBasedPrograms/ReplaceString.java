import java.util.Scanner;

/*Problem Statement:
 * Write a function find and replace which will replace the given
 *  string from the source string.
*/
public class ReplaceString {
	static void find(String key, String str, String replc)
	{
		System.out.println(str.replaceAll(key, replc));
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Source String:");
		String str = sc.nextLine();
		System.out.println("Enter the String which need to be :");
		String key = sc.next();
		System.out.println("Enter Replace with string:");
		String replc = sc.next();
		find(key,str,replc);
		sc.close();
	}

}

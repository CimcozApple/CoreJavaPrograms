import java.util.Scanner;

/*Problem Statement:
Write a function to find various combinations of entered string
static String[] getCombinations(String str)
For Eg str= “123”
Output :
123
132
213
231
312
321*/
public class CombinationString 
{
	
	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
	private void getCombinations(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                getCombinations(str, l + 1, r); 
                str = swap(str, l, i); 
            } 
        } 
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();		
        int n = str.length(); 
        CombinationString obj = new CombinationString(); 
        obj.getCombinations(str, 0, n - 1);
        sc.close();
	}

}

import java.util.Scanner;

/*Problem statement:
Find the number of occurrences of given word in a sentence.
static int check(String sentence,String word){*/
public class OccurrencesOfWord {
	static int check(String sentence,String word)
	{
		int freq = 0;
		String arr[] = sentence.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(word.equals(arr[i]))
				freq++;
		}
		
		return freq;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter the word:");
		String word =sc.next();
		
		int freq = check(sentence, word);
		System.out.print(word+" occures in sentence "+freq+" times.");
		sc.close();

	}

}

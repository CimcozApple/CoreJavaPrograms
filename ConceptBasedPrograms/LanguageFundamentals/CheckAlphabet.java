/*Problem Statement:
Write a program to check whether the input alphabet is a vowel or not.
static boolean checkAlpha(char alph)*/

import java.util.Scanner;
public class CheckAlphabet {
	static boolean checkAlpha(char alph) {
		if( alph == 'a' || alph=='e' || alph=='i' || alph=='o' || alph=='u'|| alph == 'A' || alph=='E' || alph=='I' || alph=='O' || alph=='U')
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet:");
		char alph = sc.next().charAt(0);
		boolean res=checkAlpha(alph);
		if (res)
			System.out.println("Character is a vowel");
		else
			System.out.println("Character is not a vowel");
		sc.close();

			
				
		
	}

}

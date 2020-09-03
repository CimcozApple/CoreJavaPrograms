/*
Owner: Nidhi Agrawal
Problem Statement:
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: 
Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids. 
Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 

Constraints:
2 <= candies.length <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
*/

import java.util.ArrayList;
import java.util.Scanner;

public class KidsWithCandies {
	private void solution(ArrayList<Boolean> result, int[] candies, int extraCandies) {
		int max=candies[0];
        for(int i = 1 ;i<candies.length;i++){
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies < max)
                result.add(false);
            else
                result.add(true);
        }
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int length=sc.nextInt();
		System.out.println("Enter array elements:");
		int[] candies = new int[length];
		for(int i=0;i<length;i++)
		{
			candies[i]=sc.nextInt();
		}
		System.out.println("Enter The no of Extra Candies:");
		int extraCandies=sc.nextInt();
		
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        
        KidsWithCandies obj = new KidsWithCandies();
        
        obj.solution(result, candies,extraCandies);
        
        for(int i=0 ;i<length;i++)
		{
			System.out.print(result.get(i) +",");
		}

		sc.close();

	}

	

	

}

/*
 Owner: Nidhi Agrawal
 Problem Statement:
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Constraints:
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
*/

import java.util.Scanner;

public class ShuffleArray {
	
	private void solution(int[] result ,int[] nums, int n) 
	{
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				result[j]=nums[i];
				result[++j]=nums[n];
			}
			else
			{
				result[++j]=nums[i];
				result[++j]=nums[i+n];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		
		int length=sc.nextInt();
		if(length%2 != 0)
			System.out.println("Length should be even!!!!!");
			
		
		System.out.println("Enter array elements:");
		int[] nums = new int[length];
		for(int i=0;i<length;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Enter Shuffling size:");
		int n = sc.nextInt();
		
		ShuffleArray obj = new ShuffleArray();
		int[] result = new int[length];
		obj.solution(result, nums,n);
		
		for(int i=0 ;i<length;i++)
		{
			System.out.print(result[i]+",");
		}

		sc.close();
		
	}

	

}

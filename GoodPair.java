/*
Owner: Nidhi Agrawal

Problem Statement:
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100*/


import java.util.Scanner;

public class GoodPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		
		int length=sc.nextInt();	
		System.out.println("Enter array elements:");
		int[] nums = new int[length];
		for(int i=0;i<length;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		GoodPair obj = new GoodPair();
		int sum = obj.solution(nums);
		System.out.print("No of Good Pair:"+sum);
		sc.close();
	}

	private int solution(int[] nums) 
	{
		int[] freq = new int[101];
        for(int i=0;i<nums.length;i++)
            freq[nums[i]]++;
        int sum = 0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] !=0)
                sum +=(freq[i]*(freq[i]-1))/2;
        }
        return sum;
	}

}

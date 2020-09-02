/*
 Owner: Nidhi Agrawal
 Problem Statement:
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

*/

import java.util.Scanner;

public class Solution 
{
	
	
    public int[] runningSum(int[] nums) 
    {    
        for(int i=1; i<nums.length; i++)
           nums[i]= nums[i]+nums[i-1];
        return nums;
    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums;
		System.out.print("Length of array:");
		int length = sc.nextInt();
		
		nums= new int[length];
		
		for(int i=0;i<length;i++)
			nums[i]=sc.nextInt();
			
		
		Solution s = new Solution();
		nums = s.runningSum(nums);
		
		for(int i=0 ;i<nums.length ;i++)
		{
			System.out.print(nums[i]);
		}
		sc.close();
	}

}

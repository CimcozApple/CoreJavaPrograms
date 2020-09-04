/*
Owner: Nidhi Agrawal
Problem Statement:
On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.
You can move according to the next rules:
In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
You have to visit the points in the same order as they appear in the array.
 
Example 1:

Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
Time from [1,1] to [3,4] = 3 seconds 
Time from [3,4] to [-1,0] = 4 seconds
Total time = 7 seconds

Constraints:
points.length == n
1 <= n <= 100
points[i].length == 2
-1000 <= points[i][0], points[i][1] <= 1000*/
import java.util.Scanner;

public class MinDistPoints {
	
	 public int minTimeToVisitAllPoints(int[][] points) {
	        int sum=0;
	        for(int i=0;i<points.length-1;i++){
	            int[] pos =points[i];
	            int[] posnext = points[i+1];
	            int x=Math.abs(pos[0]-posnext[0]);
	            int y=Math.abs(pos[1]-posnext[1]);
	            sum += Math.max(x,y);         
	        }
	        return sum;
	    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no  of rows:");
		int row=sc.nextInt();
		System.out.println("Enter no  of columns:");		
		int col=sc.nextInt();	
		System.out.println("Enter array elements x,y:");
		
		int[][] nums = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("Enter element at place"+i+","+j);
				nums[i][j]=sc.nextInt();
				}
		}
		
		MinDistPoints obj = new MinDistPoints();
		int sum=obj.minTimeToVisitAllPoints(nums);
		System.out.print("Minimum step to cover all points:"+sum);
		sc.close();
		
		
	}

}

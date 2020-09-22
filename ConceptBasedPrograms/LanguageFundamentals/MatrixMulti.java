/*Problem Statement:
Write a program to create a rectangular array containing a multiplication table from 1*1 up
to 12*12. Output the table as 13 columns with the numeric values right-aligned in columns.
(The first line of output will be the column headings, the first column with no heading, then
the numbers 1 to 12 for the remaining columns. The first item in each of the succeeding
lines is the row heading, which ranges from 1 to 12.)
static void displayMultiplicationMatrix()*/


public class MatrixMulti {
	static void displayMultiplicationMatrix(int[][] table)
	{
		for(int i = 0 ; i < table.length ; ++i) {
	        for(int j = 0 ; j < table[i].length ; ++j) {
	          table[i][j] = (i+1)*(j+1);
	        }
	     }
		
		//print
		 System.out.print("      :");
		 for(int j = 1 ; j <= table[0].length ; ++j) {
		      System.out.print("   " + j);
		 }
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 for(int i = 0 ; i < table.length ; ++i) {
		      System.out.print("Row" + (i<9 ? "  ":" ") + (i+1) + ":");
		 
		      for(int j = 0; j < table[i].length; ++j) {
		        System.out.print((table[i][j] < 10 ? "   " : table[i][j] < 100 ? "  " : " ") + table[i][j]);
		      }
		      System.out.println();
		    }
		
	}
	

	public static void main(String[] args) {
	    int[][] table = new int[12][12];
	    displayMultiplicationMatrix(table);
	    
	    

	}

}

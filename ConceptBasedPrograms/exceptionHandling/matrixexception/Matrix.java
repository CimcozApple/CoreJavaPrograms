package com.psl.training.matrixexception;


public class Matrix {

	public static void main(String[] args) {
		int a[][]={{9,8,2},{8,4,2},{1,2,4}};    
		int b[][]={{1,2,3},{4,5,1},{9,1,2}};   
		
		matrixAddition(a,b);
		matrixSubtraction(a,b);
		matrixMultiplication(a,b);
		matrixTranspose(a);
		
	}

	private static void matrixAddition(int[][] a,int[][] b) throws InvalidInputMatrix {
		
		
			try {
				if(a.length != b.length)
				throw new Exception("Dimention should be same");
			}
		    catch (Exception e) {
				InvalidInputMatrix newEx= new InvalidInputMatrix();
				newEx.initCause(e.getCause()); // tell what is the reason of exception
				throw newEx;
			}
		
		
		int c[][]=new int[3][3];  
		System.out.println("Addition :");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			      
			c[i][j]=a[i][j]+b[i][j];      
			
			System.out.print(c[i][j]+" "); 
			} 
			System.out.println();   
			} 
	}

	private static void matrixTranspose(int[][] a) {
		System.out.println("Transpose: :");

		int c[][]=new int[3][3];  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=a[j][i];  
			System.out.print(c[i][j]+" ");    

			}    
			System.out.println();   

			} 
		
	}

	private static void matrixMultiplication(int[][] a,int[][] b) 
	{
		int c[][]=new int[3][3];  
		System.out.println("Multiplication :");
		
		try {
			if(a.length != b.length)
			throw new Exception("Dimention should be same");
		}
	    catch (Exception e) {
			InvalidInputMatrix newEx= new InvalidInputMatrix();
			newEx.initCause(e.getCause()); // tell what is the reason of exception
			throw newEx;
		}
	

		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			}
			System.out.print(c[i][j]+" "); 
			} 
			System.out.println();   
			}    
		
	}

	private static void matrixSubtraction(int[][] a, int[][] b) {
		try {
			if(a.length != b.length)
			throw new Exception("Dimention should be same");
		}
	    catch (Exception e) {
			InvalidInputMatrix newEx= new InvalidInputMatrix();
			newEx.initCause(e.getCause()); // tell what is the reason of exception
			throw newEx;
		}
		int c[][]=new int[3][3];  
		System.out.println("Subtraction:");

		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			      
			c[i][j]=a[i][j]-b[i][j];      
			
			System.out.print(c[i][j]+" "); 
			} 
			System.out.println();   
			}
	}

}

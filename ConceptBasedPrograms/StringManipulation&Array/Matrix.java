
public class Matrix {

	public static void main(String[] args) {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};   
		
		matrixAddition(a,b);
		matrixSubtraction(a,b);
		matrixMultiplication(a,b);
		matrixTranspose(a);
		
	}

	private static void matrixAddition(int[][] a,int[][] b) {
		
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

	private static void matrixMultiplication(int[][] a,int[][] b) {
		int c[][]=new int[3][3];  
		System.out.println("Multiplication :");


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

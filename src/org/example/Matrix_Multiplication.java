package org.example;

public class Matrix_Multiplication {
	public static void main(String[] args) {
		
		int a[][] = {{2,3,4},{2,3,4},{2,3,4}};
		int b[][]= {{2,3,4},{2,3,4},{2,3,4}};
		
		int sum=0;
		int r[][]	= new int[3][3];	
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					sum= sum + a[i][k]*b[k][j];
					
					
				}
				
				r[i][j]=sum;
				sum=0;
				
			}
			
		}
	for (int i = 0; i < 3; i++) {
	   for (int j = 0; j < 3; j++) {
		   System.out.print(r[i][j]+"  ");
		
	}
	   System.out.println();
	}
	
	}
	

}

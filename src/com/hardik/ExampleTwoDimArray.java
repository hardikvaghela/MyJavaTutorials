package com.hardik;

public class ExampleTwoDimArray {

		
	public static void main(String[] args) {
		int k = 2;
		int[][] dim = new int[4][3];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				dim[i][j] = k;
				k+=2;
			}
		}
		
		//print 2 dimensional array avalues 
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(dim[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		

	}

}

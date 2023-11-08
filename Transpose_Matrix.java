package javaproject22504;

public class Transpose_Matrix {
	public static void main(String[] args) {
		int m1[][] = {{1,1,1},{2,2,2},{3,3,3}};
		for(int i = 0;i<m1.length;i++) {
			for(int j=0 ; j<m1.length;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("the transpose of above matrix is");
		for(int i = 0;i<m1.length;i++)
		{
			for(int j=0;j<m1.length;j++)
			{
				System.out.print(m1[j][i]+" ");
			}
			System.out.println("");
		}
		}

}

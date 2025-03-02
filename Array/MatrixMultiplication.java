import java.util.*;

class MatrixMultiplication{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int rowSize=sc.nextInt();
		System.out.println("Enter the column size");
		int columnSize=sc.nextInt();
		int[][] mat=new int[rowSize][columnSize];
		System.out.println("Enter the "+rowSize*columnSize+"Elements of the Matrix");
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<columnSize;j++){
				mat[i][j]=sc.nextInt();
				mat[i][j]=mat[i][j]*2;
			}
		}
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<columnSize;j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}

	}
}
import java.util.*;

class SpiralMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of the Matrix");
		int n=sc.nextInt();
		
		int[][] matrix=new int[n][n];
		System.out.println("Enter the matrix elements");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}

		int rowLower=0,columnLower=0,rowUpper=matrix.length-1,columnUpper=matrix[0].length-1; 

        while(rowLower <=rowUpper && columnLower <= columnUpper){


            for(int i=columnLower;i<=columnUpper;i++){
                
		System.out.print(matrix[rowLower][i]+" ");
            }
            rowLower++;
            for(int i=rowLower;i<=rowUpper;i++){
                
		System.out.print(matrix[i][columnUpper]+" ");
            }
            columnUpper--;

            if(rowLower>rowUpper || columnLower>columnUpper){
                break;
            }
            for(int i=columnUpper;i>=columnLower;i--){
                
		System.out.print(matrix[rowUpper][i]+" ");
            }
            rowUpper--;

            for(int i=rowUpper;i>=rowLower;i--){
                
		System.out.print(matrix[i][columnLower]+" ");
            }
            columnLower++;

        }
	}
}

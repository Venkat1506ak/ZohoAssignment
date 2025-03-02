import java.util.*;

class JaggedArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of person");
		int N=sc.nextInt();
		int[][] arr=new int[N][0];
		while(true){
			System.out.println("1.Enter the weights");
			System.out.println("2.To calculate the minimum weight");
			System.out.println("3.Exit");
			int choise=sc.nextInt();
			
			switch(choise){
				case 1:
				addWeight(arr,sc);
				break;
				case 2:
				minimumWeight(arr,sc);
				break;
				case 3:
				System.exit(0);
			}
		}
	}
	static void addWeight(int[][] arr,Scanner sc){
		System.out.println("Enter person number ");
		int person=sc.nextInt();
		int len=arr[person].length;
		System.out.println("Enter the weight to add");
		int weight=sc.nextInt();
		int[] newWeight=Arrays.copyOf(arr[person], len+1);
		newWeight[len]=weight;
		arr[person]=newWeight;
	}
	static void minimumWeight(int[][] arr,Scanner sc){
		System.out.println("Enter person number ");
		int person=sc.nextInt();
		int max=Integer.MAX_VALUE;
		for(int i=0;i<arr[person].length;i++){
			if(max>arr[person][i]){
				max=arr[person][i];
			}
		}
		System.out.println("The minimum weight Of the person is: "+max);
	}
}
import java.util.Scanner;

class SecondOccurance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arraySize;i++){
            if(array[i]==target){
                count++;
            }
            if(count==2){
                System.out.print("The index of Second occurance is : "+i);
                break;
            }
        }
    }
}
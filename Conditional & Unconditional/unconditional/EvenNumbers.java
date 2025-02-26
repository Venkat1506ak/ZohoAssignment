import java.util.*;

class EvenNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ArraySize:");
        int arraySize=sc.nextInt();
        int[] array=new int[arraySize];
        System.out.println("Enter the array elements");
        int sum=0;
        for(int i=0;i<arraySize;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<arraySize;i++){
            if(array[i]%2!=0){
                continue;
            }
            else{
                sum+=array[i];
            }
        }
        System.out.println(sum);
    }
}
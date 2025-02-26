import java.util.Scanner;

class AverageWeight{
    public static void main(String[] args){
        //int[] weights=new int[10];
        double totalWeight=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Students Weigth with space");
        for(int i=0;i<10;i++){
            totalWeight+=sc.nextDouble();
        }
        System.out.print(totalWeight/10);
    }
}
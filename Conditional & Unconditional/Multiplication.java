import java.util.Scanner;

class Multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table to print");
        int table=sc.nextInt();
        System.out.println("Enter the No.of Times to print");
        int times=sc.nextInt();
        for(int i=1;i<=times;i++){
            System.out.println(i+" * "+table+" = "+i*table);
        }
    }
}
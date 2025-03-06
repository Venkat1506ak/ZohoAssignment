import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Enter the value of c:");
        int c=sc.nextInt();

        int s=b*b-(4*a*c);
          double x1=0,x2=0;
        if(s>0){
            double m=Math.sqrt(s);
            x1=(-b+(m))/2*a;
            x2=(-b-(m))/2*a;
            System.out.println(x1);
            System.out.println(x2);
        }else{
            double m=Math.sqrt(s);
            x1=(-b+(m))/2*a;
            x2=(-b-(m))/2*a;
            System.out.println(x1+"i");
            System.out.println(x2+"i");
        }
    }
}

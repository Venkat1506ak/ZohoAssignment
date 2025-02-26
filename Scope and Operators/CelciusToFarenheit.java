import java.util.Scanner;

class CelciusToFarenheit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celcius=sc.nextDouble();
        System.out.println((celcius*9/5)+32);
    }
}
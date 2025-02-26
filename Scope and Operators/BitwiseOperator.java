import java.util.Scanner;

class BitwiseOperator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Bitwise NOT of a: "+(~a));
        System.out.println("Bitwise NOT of b: "+(~b));
        System.out.println("Right shift: "+(a>>b));
        System.out.println("Left Shift: "+(a<<b));
        System.out.println("unsigned Right shift: "+(a>>>b));
    }
}
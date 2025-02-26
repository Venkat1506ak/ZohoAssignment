import java.util.Scanner;

class GreatestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first=sc.nextInt();
        System.out.println("Enter the second value: ");
        int second=sc.nextInt();
        System.out.println("Enter the third value: ");
        int third=sc.nextInt();

        System.out.println("the greates number is "  + (first>second && first>third?first:second>third?second:third));
    }
}
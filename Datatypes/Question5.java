import java.util.*;
enum Days{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

class Question5{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day:");
        int n=sc.nextInt();
        if(n<1 || n>8){
            System.out.print("Invalid Number");
        }
        else{
            System.out.print(Days.values()[n-1]);
        }
    }
}

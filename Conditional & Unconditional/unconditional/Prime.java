import java.util.*;

class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=30;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
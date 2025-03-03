import java.util.Scanner;

class EmailValidate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(check(s)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
    static boolean check(String str){
        int index=str.indexOf("@");
        int dot=str.lastIndexOf(".");
        if(index>0 && dot>index+1 && dot<str.length()-1 && !str.contains(" ")){
            return true;
        }else{
            return false;
        }
    }
}
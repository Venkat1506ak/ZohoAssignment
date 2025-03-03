import java.util.Scanner;

class ReverseWordInSentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int index=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                sb.append(s.substring(i+1,index));
                sb.append(" ");
                index=i;
            }
        }
        sb.append(s.substring(0, index));
        System.out.println(sb);
    }
}
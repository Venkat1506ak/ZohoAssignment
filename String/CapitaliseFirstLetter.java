import java.util.Scanner;

class CapitaliseFirstLetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] word=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (String w : word) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        System.out.println(sb);
    }
}

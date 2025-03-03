import java.util.Scanner;

class SqueakyClean{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to clean");
        String s=sc.nextLine();
        System.out.println(clean(s));
    }
    static String clean(String str){
        String result = str.replaceAll("[^a-zA-Z0-9 -]","");
        
        
        if(str.contains("-")){
           result = str.substring(0,str.indexOf("-")+1)+str.substring(str.indexOf("-")+1,str.indexOf("-")+2).toUpperCase()+str.substring(str.indexOf("-")+2);
        }
        result = result.replaceAll(" ","_");
        
       // System.out.println(result);
        
        result = result.replaceAll("-","");
        result = result.replaceAll("4","a");
        result = result.replaceAll("3","e");
        result = result.replaceAll("0","o");
        result = result.replaceAll("7","t");
        result = result.replaceAll("1","l");
        //str.replaceAll("","");
        
        return result;
    }
}
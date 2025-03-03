
import java.util.*;

class BirdWatcher{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("hello");
        int[] arr=new int[]{2,7,0,1,5,4,3};
        //System.out.println("Enter the choise");
        getLastWeek(arr);
        System.out.println("Birds visited Today : "+getToday(arr));
        increaseTodaysCount(arr);
        System.out.println(checkNoBird(arr));
        System.out.println("Birds visited for first n days : "+getCountForFirstDays(4,arr));
        System.out.println("There are "+busyDays(arr)+" Busy Days");
    }
    static int busyDays(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=5){
                count++;
            }
        }
        return count;
    }
    static int getCountForFirstDays(int n,int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean checkNoBird(int[] arr){
        for(int i : arr){
            if(i==0) return true;
        }
        return false;
    }
    static int getToday(int[] arr){
        return arr[arr.length-1];
    }
    static void getLastWeek(int[] arr){
        System.out.println("Birds visited last week "+Arrays.toString(arr));
    }
    static void increaseTodaysCount(int[] arr){
        arr[arr.length-1]=arr[arr.length-1]+1;
        System.out.println("Todays count is increased : "+Arrays.toString(arr));
    }
}
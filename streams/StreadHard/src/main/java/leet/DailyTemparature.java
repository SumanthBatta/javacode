package leet;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemparature {
    public static void main(String[] args) {
        int[] a = {30, 40, 3, 2, 5, 50, 60};
       brute(a);
       optimal(a);
    }
    public static void optimal(int []a ){
        Stack<Integer> help = new Stack<>();
        int n = a.length;
        int[] res = new int[n];
        System.out.println(Arrays.toString(res));
        for( int  i = a.length-1; i>=0;i--){
            while(!help.isEmpty() && a[i]>=a[help.peek()]){
                help.pop();
            }
            //if stack still have elements, then next warmer temp present in stack
            if(!help.isEmpty()) {
                res[i] = help.peek() - i;
            }
            help.push(i);

        }
        System.out.println(Arrays.toString(res));


    }
    public static void brute(int [] a){
        int [] res = new int[a.length];

        for(int i = 0 ; i< a.length;i++){
            int c = 0;
            for(int j = i+1;j<a.length;j++){
                c++;
                if(a[j] >a[i]){
                    break;
                }
            }
            res[i]=c;
        }
        System.out.println(Arrays.toString(res));
    }

}

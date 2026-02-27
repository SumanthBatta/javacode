package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class indexEqualsLeftRight {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-7, 1, 5, 2, -4, 3, 0);

        nextGreaterElement(arr);
       System.out.println(findIndexEqualsLeftRight(arr,sum(arr)));
    }

    public static int sum(List<Integer> arr){
        int total = 0;
        for(Integer a : arr){
            total+=a;
        }
        return total;
    }

    public static int findIndexEqualsLeftRight(List<Integer> arr, int total){
        int len = arr.size();
        int left = 0;
        for(int i  = 0 ; i<len; i++){
            int right = total-left- arr.get(i);
            if(right==left){
                return i;
            }
            left+=arr.get(i);
        }
        return -1;
    }

    public static void nextGreaterElement(List<Integer> arr){
        Stack<Integer>  cont = new Stack<>();

        for(int i =  arr.size()-1 ; i>=0; i--){
            while(!cont.isEmpty() && cont.peek()<=arr.get(i)){
                cont.pop();
            }
            int greater = cont.isEmpty()?-1:cont.peek();
            String res = String.format("For %s the next is %s",arr.get(i),greater);
            System.out.println(res);
            cont.push(arr.get(i));
        }
    }

}


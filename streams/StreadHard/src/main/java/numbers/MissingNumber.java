package numbers;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int [] a= {1,2,4,5};
        int n = 5;
    }
    public static void findMissingNumber(int[] a, int n){
//        for(int i = 1; i<n;i++){
//            boolean found  = false;
//            for(int j = 0 ;j<a.length;j++){
//                if(a[j]==i){
//                    found = true;
//                    break;
//                }
//            }
//            if(!found) System.out.print(i);
//        }

        //better
        int k = a.length;

        HashMap<Integer,Boolean> has = new HashMap<>();
        for(int num : a){
            has.put(num,true);
        }
        for(int i =1; i<k+1;i++){
            if(!has.containsKey(i)) System.out.print(i);;
        }
        System.out.print(0);

        //optimal


    }
    }


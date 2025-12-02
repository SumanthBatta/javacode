package com.sum.techie;

import java.util.Arrays;

public class Elements {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,3,3,4,4,5};
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : arr){
            if(n>max){
                min = max;
                max = n;
            }
            else if(n>min && n !=max){
                min = n;
            }
        }

        System.out.println(min);

        //reverse
        int i  =0 ; int j = arr.length-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

       System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }
}

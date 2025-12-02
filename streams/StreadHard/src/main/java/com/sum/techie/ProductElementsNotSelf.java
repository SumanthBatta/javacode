package com.sum.techie;

import java.util.Arrays;

public class ProductElementsNotSelf {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,6,4};
        int [] arr1 = new int[arr.length];
        int k =0;
        for(int i = 0; i<arr.length;i++){
            int x = 1;
            int j = 0;
            for( j = 0; j<arr.length;j++){
                if(i!=j){
                    x=x*arr[j];

                }
            }
            arr1[k++]=x;


        }
        System.out.println(Arrays.toString(arr1));
    }
}

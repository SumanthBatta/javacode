package com.sum.techie;

import java.nio.channels.SelectionKey;
import java.util.Arrays;

public class Sorting {
    public static String selectionSort(int[] arr, int n){
        for(int i = 0; i<=n-2;i++){
            int min = i;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                   min = j;

                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        return "";
    }
    public static String bubbleSort(int[] arr, int n){
        for(int i = n-1; i>=0; i--){
            int sorted = 0;
            for(int j = 0; j<i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    sorted=1;
                }
            }
            System.out.println("breakjeeee");
            if(sorted==0){
                break;
            }
            System.out.println("breakj");


        }

        return Arrays.toString(arr);

    }
    public static void main(String[] args) {
        int[] a = new int[]{ 12, 22, 64,45,87};
        System.out.println(bubbleSort(a,a.length));
    }



}

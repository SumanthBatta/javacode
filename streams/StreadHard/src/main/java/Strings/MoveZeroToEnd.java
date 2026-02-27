package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 0, 1};

        try2(arr);
    }
    public static void try1(int [] arr){
        List<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i<= arr.length-1;i++){
            if(arr[i]!=0){
                arr1.add(arr[i]);
            }
        }
        for(int j = 0; j<arr.length;j++){
            if(j<arr1.size()){
                arr[j] = arr1.get(j);
            }
            else{
                arr[j]=0;
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void try2(int [] arr){
        int j = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int m : arr){
            System.out.println(m);
        }
    }
    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }


}

package com.sum.techie;

import java.util.HashMap;
import java.util.Map;

public class ElementMaxMinFreq {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,4,4,5,5,4,6,7};
            maxMin(arr,arr.length);
            maxMin1(arr, arr.length);
    }
    public static void maxMin(int[] arr, int n){
        Boolean[] visible  = new Boolean[n];

        int MaxFre = 0, minFre = n;
        int maxEle=0, minEle = 0;
        for(int i = 0; i<n;i++){
            if(visible[i]!=null){
                continue;
            }
            int c = 1;
            for(int j = i+1; j<n;j++){
                if(arr[i]==arr[j]){
                    visible[j]=true;
                    c++;
                }
            }
            if(c>MaxFre){
                MaxFre=c;
                maxEle = arr[i];
            }
            if(c<minFre){
                minFre = c;
                minEle=arr[i];
            }
        }

        System.out.println("MaxEle"+maxEle+"MinEle: "+minEle);

    }

    public static void maxMin1(int [] arr,int n){
        Map<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i<n;i++){
            hash.put(arr[i], hash.containsKey(arr[i]) ? hash.get(arr[i]) + 1 : 1);
        }
        int max=0, min= 0;
        for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
            if(max<entry.getValue()){
                min=max;
                max = entry.getKey();
            }
            if(entry.getValue()<min && entry.getValue()<max){
                min = entry.getKey();
            }
        }
        System.out.println("MaxEle: "+max+"MinEle: "+min);
    }

}


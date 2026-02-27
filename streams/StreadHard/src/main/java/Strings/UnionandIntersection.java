package Strings;

import java.util.ArrayList;
import java.util.List;

public class UnionandIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
//        union(arr1, arr1.length, arr2, arr2.length);
        intersect(arr1, arr1.length, arr2, arr2.length);

    }
    public static void intersect(int[] nums1, int m, int[] nums2, int n) {
        //brute - 1 in arr1 and iterte arr2 if match keep in new arr and make track in that arr visited like index;
        List<Integer> arr = new ArrayList<>();
//        List<Integer> index = new ArrayList<>();
//        for( int  i = 0 ; i< nums1.length;i++){
//            int a = nums1[i];
//            for(int j = 0; j<nums2.length;j++){
//                if(a==nums2[j]&& !index.contains(j)){
//                    arr.add(nums1[i]);
//                    index.add(j);
//                    break;
//                }
////                if(nums2[j]>nums1[i]) break;
//            }
//
//        }

        int i =0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
               i++;
            }
            else if (nums2[j]<nums1[i]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(arr.toString());



    }
    public static void union(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("ewwndjsknd");
        int i = 0;
        int j = 0;
        List<Integer> arr = new ArrayList<>();
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                if (arr.isEmpty() || arr.get(arr.size()-1) != nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (arr.isEmpty() || arr.get(arr.size()-1) != nums2[j]) {
                    arr.add(nums2[j]);
                }
                j++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size()-1)!= nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < m) {
            if (arr.isEmpty() || arr.get(arr.size()-1) != nums1[i]) {
                arr.add(nums1[i]);
            }
            i++;
        }
        while (j < n) {
            if (arr.isEmpty() || arr.get(arr.size()-1) != nums2[j]) {
                arr.add(nums2[j]);
            }
            j++;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
    }
}

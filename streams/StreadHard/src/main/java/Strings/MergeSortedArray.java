package Strings;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5,0,0,0,0,0};
        int m = 4;
        int[] nums2 = {2,5,5,5,8};
        int n = 5;

        mergeforSortedArrays(nums1, m, nums2, n);

//         Print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
    public static void mergeforSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for last element in nums1
        int j = n - 1; // Pointer for last element in nums2
        int k = m + n - 1; // Pointer for last position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements left, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

}

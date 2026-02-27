package numbers;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int c =1;
            for(int j = 0; j<nums.length;j++){
                    if(i==j) continue;
                    c=c*nums[j];

            }
            nums2[i] = c;
        }
        System.out.println(Arrays.toString(nums2));
        devide(nums);
        optimize(nums);
    }

    //not good if zero
    public static void devide(int[] a){
        int max = 1;
        int [] res = new int[a.length];
        for(int i = 0; i<a.length;i++){
            max= max*a[i];
        }
        for(int j = 0; j<a.length;j++){
            res[j] = max/a[j];
        }
        System.out.println(max);
        System.out.println(Arrays.toString(res));
    }
    public static void optimize(int[] a){
        int n = a.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 1;
        for(int i = 1; i<n;i++){
            left[i] = left[i-1]*a[i-1];
        }
        right[n-1] = 1;
        for(int i = n-2;i>-1;i--){
            right[i] = right[i+1]*a[i+1];
        }
        for(int i = 0; i<n;i++){
            res[i] = left[i]*right[i];
        }
        System.out.println(Arrays.toString(res));
    }

}

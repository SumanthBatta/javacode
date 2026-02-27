package Strings;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String a = "I Love India";
        String[] arr = a.split(" ");

        System.out.println(Arrays.stream(arr).map(w-> new StringBuffer(w).reverse()).collect(Collectors.joining(" ")));

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ReverseEachWord sol = new ReverseEachWord();
        int k = sol.removeDuplicates1(nums);
        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length ==1) return nums.length;
        HashSet<Integer> seen = new HashSet<>();

        int index = 0;
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
    public int removeDuplicates1(int[] nums) {
        if (nums.length ==1) return nums.length;
       int i = 0;
       for(int j =1 ; j<nums.length; j++){
           if(nums[j]!=nums[i]){
               i++;
               nums[i] = nums[j];
           }
       }
       return i+1;
    }

}

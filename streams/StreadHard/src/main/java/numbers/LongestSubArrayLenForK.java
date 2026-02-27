package numbers;

public class LongestSubArrayLenForK {
    public static void main(String[] args) {
        int [] nums = {10, 5, 2,-2,2, 7, 1,-1, 9};
//        int [] nums = {-3, 2, 1};
        int  k =15;
        int m = 0;
        for(int i = 0; i<nums.length;i++){
            int c = 0;
            for(int j = i; j< nums.length;j++){
                c+=nums[j];
                if(c==k){
                    m  = Math.max(m ,j-i+1);
                 break;
                }
            }
        }
        System.out.println(m);
        System.out.println(toPointer(nums,15));
    }

    //twopointer:
   public static int toPointer(int[] nums, int k){
        int n = nums.length;
        int max = 0 ;
        int left = 0, right=0;
        int sum = nums[0];
        while(right<n){
            while(left<=right && sum >k){
                sum-=nums[left];
                left++;
            }
            if(sum == k){
                max = Math.max(max,(right-left)+1);
            }
            right++;
            if(right<n){
                sum+=nums[right];
            }
        }
        return max;
   }

   //Hashing




}

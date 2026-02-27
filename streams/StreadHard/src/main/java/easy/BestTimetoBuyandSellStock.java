package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price : nums){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxprofit=Integer.max(maxprofit,price-minPrice);
            }

        }
//        List<Integer> arr = new ArrayList<>(nums.);
//        for(int i : nums){
//            if(target-numsi)
//        }
//        return new int[]{};
        return maxprofit;
//        if(nums.length==1) return nums[0];
//
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int n : nums){
//           map.put(n, map.getOrDefault(n,1)+1);
//        }
//        map.forEach((k,v)->{
//            if(v==1){
//                System.out.println(k);
//            }
//        });
//return 0;
    }
}

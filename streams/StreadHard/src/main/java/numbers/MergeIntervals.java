package numbers;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
//        int[][] a = {{1,3},{2,6},{8,10},{15,18}};
        int[][] a = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        System.out.println(Arrays.deepToString(mergeInterval(a)));
    }
    public static int[][] mergeInterval(int[][]a){
        if(a.length<=1){
            return a;
        }
        Arrays.sort(a, Comparator.comparingInt(i->i[0]));

        int[] newInterval = a[0];
        List<int[]> res = new ArrayList<>();
        res.add(newInterval);

        for(int[] interval : a){
            if(interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                res.add(newInterval);
            }
        }
//        for(int[] interval : a){
//            if(res.isEmpty() || res.get(res.size()-1)[1]<interval[0]){
//                res.add(interval);
//
//            }
//            else{
//                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1],interval[1]);
//            }
//        }
        return res.toArray(new int[res.size()][]);
    }
}

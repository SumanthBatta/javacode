package Try;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collectionss {
    public static void main(String[] args) {
        List<Integer> sales = Arrays.asList(101, 102, 101, 103, 101, 102, 103, 103,
                103);

        Map<Integer,Integer> cont  = new HashMap<>();
        for(int id : sales){
            cont.put(id, cont.getOrDefault(id,0)+1);
        }
        System.out.println(cont);

        int maxCount = 0,  max = -1;
        for(Map.Entry<Integer,Integer> entru : cont.entrySet()){
            if(entru.getValue()>maxCount){
                max = entru.getKey();
                maxCount = entru.getValue();

            }

        }
        System.out.println(max+" "+maxCount);
    }
}

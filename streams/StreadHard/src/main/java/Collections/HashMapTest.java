package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String,Integer> t1 = new HashMap<>();
//        t1.put("alice",1);
//        if(!t1.containsKey("alice")){
//            t1.put("alice",1);
//        }
//        else{
//            t1.put("alice",t1.get("alice")+1);
//        }
        t1.computeIfAbsent("alice",key->1);
        t1.computeIfPresent("alice", (key, count)->count+1);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(n->{System.out.println(n+1);});
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        System.out.println(t1);
        numbers.forEach(method);

        String word1 = "ab", word2 = "pqrs";
        StringBuilder str  = new StringBuilder();
        for (int i = 0 ; i<word1.length()+word2.length();i++){

            if(i<word1.length()&&i<word2.length()){
                str.append(word1.charAt(i)).append(word2.charAt(i));
                continue;
            }
            if(i<word1.length()){
                str.append(word1.charAt(i));
                continue;
            }
            if(i<word2.length()){
                str.append(word2.charAt(i));
            }

        }
        System.out.println( str.toString());


    }




}

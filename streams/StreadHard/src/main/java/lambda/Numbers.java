package lambda;

import java.util.*;
import java.util.function.Consumer;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);
//        input.forEach(n -> System.out.print(n+" "));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> method = (n) -> {
//            System.out.println(n);
        };
//        numbers.forEach(method);


        System.out.println(isHappy(18));
    }



public static boolean isHappy(int n) {
Set<Integer> seen = new HashSet<>();
while(n!=0 && !seen.contains(n)){
    seen.add(n);
    n = sumOfSquares(n);
}
return n==1;
}
public static int sumOfSquares(int n){
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum+=dig*dig;
            n= n/10;
        }
        return sum;
}
}

package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAvrg {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4,8,15,16,23,42);

        int window = 3;

        List<Double> result = IntStream.range(0,input.size()-(window-1))
                .mapToObj(i->input.subList(i, i+window))
                .map(w->w.stream()
                        .mapToInt(Integer::intValue)
                        .average().
                        orElse(0.0)
                ).toList();

        System.out.println(result);
        input.forEach(n->System.out.println(n));


    }
}

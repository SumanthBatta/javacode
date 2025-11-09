package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiGramFrequency {
    public static void main(String[] args) {
        String s = "Java is easy and Java is good. Java is Nice !";
        String[] words = s.toLowerCase()
                .replaceAll("[^a-z\\s]","")
                .split(" ");
        List<String> list = IntStream.range(0,words.length-1)
                .mapToObj(i->words[i]+" "+words[i+1]).toList();
        System.out.println(list);
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        for(String a: words) {
            System.out.println(a);
        }

    }
}

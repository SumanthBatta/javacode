package streams;

import java.util.Arrays;
import java.util.List;

public class getEvnFrmList {
    public static void main(String[] args) {
        List<Integer > list = Arrays.asList(2,3,4,7,9);

        List<Integer> res = list.stream().filter(n->n%2==0).toList();

        res.forEach(n->System.out.println(n));
    }
}

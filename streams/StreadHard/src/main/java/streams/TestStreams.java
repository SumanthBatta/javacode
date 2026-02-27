package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TestStreams {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("1","2","3");
        List<String> nums1 = nums.stream().map(s->s+"dskdnkws").toList();
        System.out.println(nums1);
        System.out.println(nums.stream().collect(Collectors.joining("dfkdfm")).toString());
    }
}

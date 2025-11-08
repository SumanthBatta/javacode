package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSpendDay {
    public static void main(String[] args){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", LocalDate.of(2024,1,1),360),
                new Transaction("T56", LocalDate.of(2025,3,4),340),
                new Transaction("T2", LocalDate.of(2025,6,2),370),
                new Transaction("T31", LocalDate.of(2024,1,1),390),
                new Transaction("T3", LocalDate.of(2024,1,1),300)
        );
       Map<LocalDate,Double> collect  = transactions.stream().collect(Collectors.groupingBy(
               Transaction::getDate,
               Collectors.summingDouble(Transaction::getAmount)
       ));
       System.out.println(collect);
        System.out.println(collect.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null));

Map.Entry<LocalDate,Double> localDateDoubleEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(localDateDoubleEntry);
    }
}

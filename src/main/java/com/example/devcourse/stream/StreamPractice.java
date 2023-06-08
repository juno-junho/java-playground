package com.example.devcourse.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer>  numbers = List.of(1, 2, 3, 4, 5);

        Optional<Integer> reduce = numbers.stream().reduce((a, b) -> a * b);
        System.out.println(reduce.get());

        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        
        // 모든 거래자의 이름을 알파벳 순으로 정렬해 반환하시오
        String traderString = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));

        System.out.println(traderString);

        Optional<Transaction> min = transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);


        System.out.println(1.234 % 1);

        // 피보나치 수열 집합
        Stream.iterate(new int[]{0, 1}, array -> new int[]{array[1], array[0] + array[1]})
                .limit(10)
                .map(i -> i[0])
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, array -> new int[]{array[1], array[0] + array[1]})
                .limit(10)
                .map(i -> i[0])
                .forEach(System.out::println);

        // 스트림 short circuit
        IntStream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);
    }
}

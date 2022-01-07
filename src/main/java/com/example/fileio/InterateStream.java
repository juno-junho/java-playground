package fileio;

import java.util.stream.Stream;

public class InterateStream {
    public static void main(String[] args) {
        // interate(T seed, UnaryOperator f) 단항 연산자. 하나를 넣으면 결과가 하나 나오는것.
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 2);
        integerStream.limit(10).forEach(System.out::println);


        // generate(Supplier s) : 주기만 하는 것. 입력이 없고 출력만 있음.
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);
    }
}

package fileio;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomStream {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints();  // 무한 스트림이라 limit을 지정해줘야 한다.
        IntStream intStream1 = new Random().ints(5,10);//범위를 줄수 있다.
        intStream1
                .limit(6)   // 5갸먼 자르기
                .forEach(System.out::println);

        IntStream intStream2 = IntStream.range(1,10);
        IntStream intStream3 = IntStream.rangeClosed(1,10);
        System.out.println(intStream2);
        intStream2.forEach(System.out::println);
        System.out.println("-------" );
        intStream3.forEach(System.out::println);
    }
}

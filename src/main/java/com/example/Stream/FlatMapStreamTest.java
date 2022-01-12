package Stream;

import java.util.*;
import java.util.stream.*;

public class FlatMapStreamTest {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)    // 스트림의 요소를 모두 소문자로 변환
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) //line split하면 string배열이 나옴.
                // 하나이상의 공백을 표현하기 위해서 " +"
                // Stream<String> -> Stream<Stream<String>> (map을 쓸 경우)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
package fileio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream(); // list를 stream으로 변환
        intStream.forEach(System.out::println); // forEach() 최종연산
//        intStream.forEach(System.out::println); stream이 닫혔기 때문에 불가능.

        // stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
        intStream = list.stream();
        intStream.forEach(System.out::println);

//        Stream<String> strStream = Stream.of("a","b","c");
//        Stream<String> strStream = Stream.of(new String[]{"A", "B", "C", "D"});
        String[] strArr = {"a", "b", "c", "d"}; // 이렇게 생성 가능. but 위에 배열 넘길때는 new 써줘야함. 배열 초기화.
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        // 기본형 스트림. (primitive type)
        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);
        // 이렇게 다양한 것 지원 (숫자인것 아니깐)
//        System.out.println("sum = " + intStream1.sum());
        System.out.println("average = " + intStream1.average());
//        Integer[] intArr1 = {new Integer(1), new Integer(2), new Integer(3)};

        // Integer 객체 스트림.
        Integer[] intArr1 = {1,2,3,4,5};    //원래 위같이 하는게 맞음. 오토박싱됨.
        Stream<Integer> integerStream = Arrays.stream(intArr1);
//        integerStream.forEach(System.out::println);
        System.out.println("count = " + integerStream.count());
//        System.out.println("sum = " + integerStream.sum()); sum은 없음

    }
}

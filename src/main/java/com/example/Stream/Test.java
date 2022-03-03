package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strArr = {"Apple", "Banana", "Orange"};
        List<String> strList = Arrays.asList(strArr);

        //출력
        Arrays.sort(strArr);
        Collections.sort(strList);

        for (String s : strArr) {
            System.out.println(s);
        }
        for (String s : strList) {
            System.out.println(s);
        }
        Stream<String> stringStream = strList.stream();
        Stream<String> stringStream1 = Arrays.stream(strArr);

        stringStream.sorted().forEach(System.out::println);
        stringStream1.sorted().forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 5);
        IntStream intStream1 = IntStream.rangeClosed(1, 5);

        intStream.forEach(System.out::println);
        intStream1.forEach(System.out::println);

    }
}

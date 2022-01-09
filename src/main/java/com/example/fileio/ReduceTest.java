package fileio;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel() //병렬로 처리
                .forEachOrdered(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').findFirst();//첫번째 문자가 s인것 중 첫번째인것.

        System.out.println("noEmptyStr="+noEmptyStr);
        System.out.println("sWord="+ sWord.get());

        // Stream<String>을 Stream<Integer>으로 변환
//        Stream<Integer> intStream01 = Stream.of(strArr).map(String::length);

        // Stream<String>을 IntStream으로 반환. (위와 같은것인데 성능때문에 쓰는것)
//       (s) -> s.length()
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a,b) -> a + 1);
        int sum   = intStream2.reduce(0, (a,b) -> a + b);

//        아래는 accumulator밖에 없기 때문에 null이 될수 있으므로 Optional을 결과로 준다.
        OptionalInt max = IntStream.empty().reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("count="+count);
        System.out.println("sum="+sum);
        System.out.println("max="+ max.orElse(0));
        System.out.println("min="+ min.getAsInt());
    }
}

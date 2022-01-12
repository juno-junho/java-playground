package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class StreamTest {
    public static void main(String[] args) {
        String[] array = { "carrot", "apple", "banana", "egg", "meat", "apple" };

        Arrays.stream(array)
                .distinct()
                .filter(s -> s.length() > 4)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Arrays.stream(array)
                .sorted()
                .findFirst()    //optional로 변환시킴.
                .ifPresent(System.out::println);
    }
}

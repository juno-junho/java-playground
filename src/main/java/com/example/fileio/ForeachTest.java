package fileio;

import java.util.stream.IntStream;

public class ForeachTest {
    public static void main(String[] args) {
        //sequential()은 직렬 스트림. parallel()은 병렬 스트림. 여러 쓰레드 나눠서 작업.
        //기본적으로 직렬스트림이라 생략해도됨. parallel()로 여러 쓰레드 나눠 처리하면 순서 보장이 안됨.
        // forEachOrdered라는것이 있다 정도로만 알면됨.
        // -> 병렬일때 forEachOrdered() 사용하면 순서 보장이 된다.
        IntStream.range(1,10).sequential().forEach(System.out::print);
        System.out.println();
        IntStream.range(1,10).sequential().forEachOrdered(System.out::print);
        System.out.println();

        IntStream.range(1,10).parallel().forEach(System.out::print);
        System.out.println();
        IntStream.range(1,10).parallel().forEachOrdered(System.out::print);

    }
}

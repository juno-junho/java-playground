package fileio;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalIntTest {
    public static void main(String[] args) {
        Optional<String>  optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);  // 값 변환 (s -> s.length())와 동일.
        System.out.println("optStr="+optStr.get());
        System.out.println("optInt="+optInt.get());

        int result1 = Optional.of("123")
                .filter(x->x.length() >0)   //filter도 사용 가능.
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).orElse(-1); //value값이 없으면 -1 반환.

        System.out.println("result1="+result1);
        System.out.println("result2="+result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x->System.out.printf("result3=%d%n",x)); //null이 아닐때만 실행

        OptionalInt optInt1  = OptionalInt.of(0);   // 0을 저장 isPresent : true
        OptionalInt optInt2  = OptionalInt.empty(); // 빈 객체를 생성 isPresent : false

        System.out.println(optInt1.isPresent());   // true
        System.out.println(optInt2.isPresent());   // false

        System.out.println(optInt1.getAsInt());  // 0
//		System.out.println(optInt2.getAsInt());  // NoSuchElementException
        System.out.println("optInt1="+optInt1);
        System.out.println("optInt2="+optInt2);
        System.out.println("optInt1.equals(optInt2)?"+optInt1.equals(optInt2));
    }
}

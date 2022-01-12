package Stream;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
//        int[] arr = {};
//        int[] arr = null; // NullPointerException 예외발생
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

//        Option>String> opt = null;    // 에러안남.. but 바람직하지 않음.
        Optional<String> opt = Optional.empty();
//        Optional<String> opt = Optional.of("abc");
        System.out.println("opt = " + opt);
//        System.out.println("opt = " + opt.get());
        String str = "";

//        try {
//            str = opt.get();
//        } catch (Exception e) {
//            str = "";   //예외가 발생하면 빈문자열 ("")로 초기화
//        }
//        str = opt.orElse("It's empty!"); //Optional에 저장된 값이 null이면 괄호 안 값 반환
//        str = opt.orElseGet(()->"It's empty!");
//        str = opt.orElseGet(()->new String());
        str = opt.orElseGet(String::new);
        System.out.println("str = " + str);


    }
}

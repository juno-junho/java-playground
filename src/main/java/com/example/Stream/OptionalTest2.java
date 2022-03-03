package Stream;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        String str = "HWANG JUNHO";
        Optional<String> str1 = Optional.of(str);
        Optional<String> str2 = Optional.of("Junho Hwang");

        System.out.println(str1.get());

//        Optional<Object> obj1 = Optional.of(null);
        Optional<Object> obj2 = Optional.ofNullable(null);

//        System.out.println(obj1.get());
//        System.out.println(obj2.get());

        Optional<String> optional = null;
        Optional<String> optional1 = Optional.empty();

        System.out.println(optional1.orElse("No Value"));
        System.out.println(optional1.orElseGet(() -> new String("No Value")));
//        System.out.println(optional1.orElseThrow(NoSuchElementException::new));

        System.out.println("----------");
        if (str != null){
            System.out.println(str);
        }
        if (Optional.ofNullable(str).isPresent()){
            System.out.println(str);
        }
        Optional.ofNullable(str).ifPresent(System.out::println);
    }
}

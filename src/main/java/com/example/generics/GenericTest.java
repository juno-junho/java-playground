package generics;

import java.util.ArrayList;

class Phone{}
class Pad{}

public class GenericTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //generics 도입 이전 (JDK 1.5 이전)
        // ArrayList<Object> list = new ArrayList<Object>(); (JDK 1.5 이후) 이렇게 적어야함.
        list.add(10);   //list.add(new Integer(10)); 오토박싱
        list.add(20);
        list.add("30"); //String 추가

        System.out.println(list);

        Integer integer = (Integer)list.get(2); //컴파일 에러가 없다.
        // list.get()의 return type은 object이기 때문에 Integer로 형변환 한다고 해서 문제되는것은 없다.
        // 하지만 실제 값은 String이다. --> 형변환에러 ClassCastException. 컴파일에러 >실행시 발생하는 에러.
        // 따라서 generics 를 통해서 더 많은 정보를 준다.
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
//        list1.add("3");

        Integer integer1 = list1.get(2); // 형변환 생략 가능.

        System.out.println(list);
        System.out.println("a" ) ;

        ArrayList<Phone> list2 = new ArrayList<Phone>();
        list2.add(new Phone());
//        list2.add(new Audio());   Tv타입의 객체만 저장 가능.
        Phone phone = list2.get(0);   // 형변환 필요 없음. 타입 일치하기 때문

    }
}

package oop;

class AAA{  //AAA는 BBB의 외부 클래스
    int i = 100;
    BBB b = new BBB();

    class BBB{  // BBB는 AAA의 내부 클래스. AAA안에서만 사용한다는 가정으로 집어 넣음.
        void method1(){
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능.
        }
    }
}
//class BBB{
//    void method1(){
//        AAA a = new AAA();
//        System.out.println(a.i);
//    }
//}
class CCC{
//    BBB b = new BBB();

}

public class InnerClassTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method1();
        // BBB클래스를 내부클래스로 만들면 AAA객체를 먼저 생성한 다음에 사용할 수 있다.
        // AAA클래스의 멤버처럼 다뤄진다.
        AAA aaa = new AAA();
        AAA.BBB bbb = aaa.new BBB(); // 이렇게 생성 가능.
//        AAA.BBB bbb = new AAA.BBB()

    }

}

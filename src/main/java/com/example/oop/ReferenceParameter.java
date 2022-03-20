package oop;

class Data2{
    int x;
}
// 참조형 매개변수 (Reference Paramter)의 경우 참조변수가 객체의 주소값을 가지고 있으므로 읽고 쓰기가 가능.
public class ReferenceParameter {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);  // 10

        change(d);    //  1000 -> 객체 주소를 가지고 있기 때문에 읽고 쓰기가 가능하다.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 1000
    }
    static void change(Data2 d){
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

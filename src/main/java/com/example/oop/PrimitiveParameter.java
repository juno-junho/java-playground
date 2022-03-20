package oop;

class Data{
    int x;
}
// 기본명 매개변수 (Primitive parameter)는 값만 복사. 객체가 어디있는지 모름.
public class PrimitiveParameter  {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);  // 10

        change(d.x);    //  1000
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 10
    }
    static void change(int x){ // Primitive Parameter : read only. cannot change the value.
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}

package oop;

public class AnonymousClass1 {
    Object iv = new Object(){void method(){}};  // Anonymous class
    static Object cv = new Object(){void method(){}};// Anonymous class

    void method(){
        Object lv = new Object(){ void method(){}}; // Anonymous class
    }
    public static void main(String[] args) {

    }
}

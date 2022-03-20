package oop;

public class InnerClassTest2 {
    class InstanceInner{
        int iv = 100;
        final static int CONST = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void method(){
        class LocalInner{
            int iv = 400;
            final static int CONST = 500;
        }
        int i =LocalInner.CONST; // 가능 (메소드 안이기 때문)
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST); // 에러 발생. 지역내부클래스는 메소드 안에서만 사용가능.
    }
}

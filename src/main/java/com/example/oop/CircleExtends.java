package oop;

public class CircleExtends extends Object{

    int add(int a, int b){
        System.out.println("int type method");
        return a + b;
    }
    long add(long a, long b){
        System.out.println("long type method");
        return a+b;
    }

    public static void main(String[] args) {
        CircleExtends circleExtends = new CircleExtends();
        // 아래 두 문장이 같은 것임 (println() 메소드의 기능)
        System.out.println(circleExtends);
        System.out.println(circleExtends.toString());

        System.out.println(circleExtends.add(1,2));
        System.out.println(circleExtends.add(6L, 2L));
        System.out.println(circleExtends.add(5,4L));
    }
}

package Lambda;
@FunctionalInterface
interface MyFunction {
    void run();  // public abstract void run();
}

class Ex14_1 {
    static void execute(MyFunction f) { // 매개변수 타입이 Myfuntion(Functional Interface)인 메소드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메소드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = ()-> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            // 익명 클래스로 run() 구현
            public void run() {//반드시 public 붙혀야함.
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

//        f1.run();
//        f2.run();
//        f3.run();

        execute(() -> System.out.println("f1.run"));
        execute( ()-> System.out.println("run()" ) );
    }
}
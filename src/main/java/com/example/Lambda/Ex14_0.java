package Lambda;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj (a, b) -> a > b ? a: b; // 람다식, 익명 객체
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
              }
        };
        //형변환 해줘야하는데 해줄 수가 없다
        // 따라서 필요한것이 함수형 인터페이스
        //int value = obj.max(3,5); // 아예 부를 수가 없다.
        /*
        MyFunction2 f = new MyFunction2() {
            @Override
            public int max(int a, int b) {  // 오버라이딩 - 접근제어자는 좁게 못바꾼다. public 써줘야함.
                return a > b ? a : b;
            }
        };
        */
        //람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b;    //람다식. 익명객체
        int value = f.max(3,5); // 함수형 인터페이스
        // 위 람다식을 사용하기 위해서는 이름이 필요하기 때문에 max라고 아래 함수형 인터페이스에서 이름을 붙혀주는것.
        // 함수형 인터페이스의 메소드와 람다식을 연결해주는 거라 보면 된다.
    }
}
@FunctionalInterface    // 함수형 인터페이스는 단 하나의 추상 메소드만 가져야 한다.
interface MyFunction2 {
//    public abstract int max(int a, int b);
    int max(int a, int b);
//    public abstract int min(int a, int b);
}

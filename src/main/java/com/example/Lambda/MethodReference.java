package Lambda;

import com.google.common.base.Function;

public class MethodReference {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt;    // 메소드 참조. 위 코드와 같은 코드임.
        // String s가 없어도 된다. 입력이 string인것은 제네릭으로 정보 제공.
        // s가 없어도 parseInt가 매개변수 몇개 받는지 다 알고 있음. 메소드 선언부를 컴파일러가 다 알고있다.
        System.out.println(f.apply("100") + 200);

        // Supplier : 입력 x 출력만 있음.
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s1 = MyClass::new;
//        MyClass mc = s.get();
//        System.out.println(mc);
//        Function<Integer,MyClass> f1 = MyClass::new;
//        Function<Integer,MyClass> f1 = (i) -> new MyClass(i);
//        MyClass mc = f1.apply(500);
//        System.out.println(mc.iv);

//        Function<Integer,int[]> f2 = (i) ->  new int[i];
//        Function<Integer,int[]> f2 = int[]::new; // 메소드 참조
//        System.out.println(f2.apply(100).length);

    }
}
class MyClass{
    // 아래 코드 추가하면 Function으로 바꿔야 한다. (이 부분 솔직히 좀 이해 안됨) : 생성자에 iv를 받아야 하기 때문에
    int iv;
    MyClass(int iv){
        this.iv = iv;
    }
}
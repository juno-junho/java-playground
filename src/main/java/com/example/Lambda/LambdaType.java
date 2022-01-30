package Lambda;

public class LambdaType {
    public static void main(String[] args) {
        MyFunction f = () -> {};    // MyFunction f = (MyFunction) ( ()->{} );
        Object obj = (MyFunction) ( ()->{} );   // Object 타입으로 형변환 생략
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
        Object obj1 = new Object(){};
        System.out.println(obj1);
    }
}


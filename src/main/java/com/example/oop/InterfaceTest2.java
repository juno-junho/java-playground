package oop;
class A{
//    public void method(B b){
    public void method(I b){ // C 클래스로 바꾸려먼 C로 바꿔야함.
        b.method();
    }
}
// B클래스의 선언과 구현을 분리.
interface I{
    void method();
}
class B implements I{
    public void method(){
        System.out.println("Call B class method");
    }
}

class C implements I{
    public void method(){
        System.out.println("Call C class method");
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());  // A가 B를 사용 (의존)
        // C로 바꾸기
        a.method(new C());
        // 목표 : A 클래스가 변경이 없도록.
    }
}
// A 클래스의 변화가 없는 것이 중요하다.
// 변경이 일어나면 실수가 있을수도 있기 때문에 변경을 최소화 함으로서 에러날 확률이 줄어듦.


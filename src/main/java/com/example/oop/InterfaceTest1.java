package oop;

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("Stop!");
    }
}
interface Fightable{    // 인터페이스의 모든 메소드는 예외없이 public abstract
    void move(int x, int y); // public abstract 생략
    void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{

    @Override //overriding 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다. 따라서 반드시 public이여야 함.
    public void move(int x, int y) {
        System.out.println("Move to [" + x + ", " + y + "]");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println("Attack " + f);
    }
    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightable(){
        Fighter fighter = new Fighter();
        return (Fightable) fighter;
    }
}
public class InterfaceTest1 {
    public static void main(String[] args) {
        Fightable fighter = new Fighter();
        fighter.move(100, 200);
        fighter.attack(new Fighter());
        // 참조변수 타입이 Unit일때는 Attack() 호출 불가능.
        // 참조변수 타입이 Fightable 일때는 stop() 호출 불가능.
        Fighter f = new Fighter();
        Fighter fightable = (Fighter) f.getFightable();
        fightable.attack(f);
    }
}

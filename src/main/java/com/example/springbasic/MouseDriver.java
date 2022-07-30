package springbasic;
class Mouse{
    public String name;
    public int age;
    public static int countOfTail = 1;

    public void sing(){
        System.out.println(name + "찍찍!");
    }
}
public class MouseDriver {
    public static void main(String[] args) {

        Mouse.countOfTail = 2;
        Mouse micky = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        System.out.println(micky.countOfTail);
        System.out.println(jerry.countOfTail);
        Mouse.countOfTail = 3;
        System.out.println(mightyMouse.countOfTail);

        System.out.println(Mouse.countOfTail);
    }
}

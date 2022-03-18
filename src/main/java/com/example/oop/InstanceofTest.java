package oop;

public class InstanceofTest {
    public static void main(String[] args) {
//        FireEngine fireEngine = new FireEngine();
        Car fireEngine = new Car(); // 해보면 다름
//        Car fireEngine = new FireEngine();
//        Object fireEngine = new FireEngine();

        if (fireEngine instanceof FireEngine) System.out.println("FireEngine instance");
        if (fireEngine instanceof Car) System.out.println("Car instance");
        if (fireEngine instanceof Object) System.out.println("Object instance");

        Object car1 = new FireEngine();
        Car car2 = new Car();
        System.out.println(car1 instanceof Car);
        System.out.println(car2 instanceof Car);
        System.out.println(car1 instanceof Object);
        System.out.println(car2 instanceof Object);
        System.out.println(car1 instanceof FireEngine);
        System.out.println(car2 instanceof FireEngine); // false // 주의하기. 헷길리지 말기.

        System.out.println(1 + 2 + ""); // 3
        System.out.println("" + 1+ 4); // 14
    }
}

package oop;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;    // car = (Car)fe;에서 형변환이 생략됨
//		car.water(); // 에러
        fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
        fe2.water();

        System.out.println("-------------");

//        Car car1 = new Car();

        Car car1 = new FireEngine(); // 실제 인스턴스가 뭔지가 중요하다.
        FireEngine fireEngine1 = (FireEngine) car1; // 조상 -> 자손 형변환 가능 (위험함. 인스턴스가 뭔지를 봐야함)
        // car1이 Car 인스턴스이면 ClassCastException 발생.
        Car car2 = fireEngine1; // 자손 -> 조상 형변환 가능.
        System.out.println(fireEngine1.color);
        System.out.println(fireEngine1.door);
        fireEngine1.drive();
        fireEngine1.stop();
        System.out.println(car2.color);
        System.out.println(car2.door);
        car2.drive();
        car2.stop();
//        car2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() { 	// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {  	// 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {	// 소방차
    void water() {	// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

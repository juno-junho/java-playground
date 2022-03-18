package oop;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getHour());
        time.setHour(21);
        System.out.println(time.getHour());

        time.setHour(-1);
        System.out.println(time.getHour());

        time.setHour(26);
        System.out.println(time.getHour());
    }
}

class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    //굳이 public으로 할 필요가 없다. 내부에서만 쓰는 메소드 이기 때문에.
    // 테스트 할 범위가 줄어들기 때문에 접근제어자는 좁힐수록 좋다. 필요할때 넓히면 됨.
    private boolean isNotValidHour(int hour){
        return hour < 0 || hour > 23;
    }
    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    Time(){
        hour = 5;
    }
}

package oop;

class Tv {
    String color;
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){
        ++channel;

    }
    void channelDown(){
        --channel;
    }
}

class TvTest1{
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.equals(t2));
        System.out.println(t1 == t2);
        t1.channel = 7;
        t1 = t2;
        System.out.println(t1.equals(t2));


    }

}
package JavaLang;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) return false;

        Card card = (Card) obj;
        return number == card.number && kind.equals(card.kind);
        // kind가 String이기 때문에.
    }
    // equals()를 오버라이딩 하면 hashCode()또한 override해야 한다.
    // Objects클래스 : 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스.
    // hash()는 가변인자라서 호출시 지정하는 값의 개수가 정해져 있지 않다. 파라미터 주어진 것으로 해시코드 생성하는 역할.
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    //Object 클래스의 toString()을 오버라이딩.
    // -> iv값들을 문자열로 바꾸는 것.
    @Override
    public String toString() {
        return "kind='" + kind + ", number=" + number;
    }
}

class Ex9_4 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
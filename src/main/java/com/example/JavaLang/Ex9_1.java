package JavaLang;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    } // main
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    //Object의 equals()를 오버라이딩해서 주소가 아닌 value 값을 비교.
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true; // 주소비교.서로 다른 객체는 항상 거짓.
//        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Value)) return false;
        Value value1 = (Value) o;  // o를 value로 형변환.
        return value == value1.value;
    }

}

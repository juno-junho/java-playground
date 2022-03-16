package collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSet_3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이라 제거 안됨.
        set.add(new Person("David",10));
        set.add(new Person("David",10)); // equals(), hashCode() overriding 안되어 있어서 HashSet이 바르게 작동 하지 않음.

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person tmp = (Person) o;
        // 자신 (this)의 이름과 나이를 tmp와 비교
        // 형변환 하지 않으면 컴파일 에러. o에는 name과 age라는 멤버가 없다. (다형성)
        return this.name.equals(tmp.name) && this.age== tmp.age;
    }


    @Override
    public int hashCode() {
        // int hash(Object... values)   // 가변인자.
        return Objects.hash(name, age);
    }
}
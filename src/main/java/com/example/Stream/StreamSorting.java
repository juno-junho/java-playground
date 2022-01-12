package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSorting {
    public static void main(String[] args) {
        Stream<Student> studentStream = Arrays.stream(new Student[]{
                new Student("lee", 3, 300),
                new Student("kim", 1, 200),
                new Student("Ann", 2, 100),
                new Student("park", 2, 150),
                new Student("So", 1, 200),
                new Student("Na", 3, 290),
                new Student("Lim", 3, 180)
        });

//        studentStream.sorted(Comparator.comparing(Student::getBan)  // 1. 반별정렬 sort with class(ban)
        studentStream.sorted(Comparator.comparing((Student s) -> s.getBan())    // 이렇게 메소드 참조를 람다식으로 바꿀수 있음.
                .reversed()
                .thenComparing(Comparator.naturalOrder())
                .reversed())  // 2. 기본정렬 (compareTo overriding)
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    // 총점 내림차순을 기본 정렬로 한다.
    @Override
    public int compareTo(Student o) {
        return o.totalScore - this.totalScore;
    }
}

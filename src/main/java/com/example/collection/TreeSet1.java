package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Set set = new TreeSet(); //범위 검색, 정렬에 유리, 정렬 필요 없음
////        Set set = new HashSet();  // 정렬 필요
//        for (int i = 0; set.size() < 6 ; i++) {
//            int num = (int)(Math.random()*45) + 1;
//            set.add(num);  // set.add(new Integer(num));
////            set.add(new Test()); // 비교 기준이 없기 때문에 에러.
//        }
        set.add(new Test());
        set.add(new Test());
        set.add(new Test());
        set.add(new Test());
        set.add(new Test());


        // HashSet인 경우 LinkedList로 옮긴 다음 정렬 했음. (HashSet_2)
        System.out.println(set);
    }
}

//class Test{}    // 비교 기준이 없음 Comparable 구현하면 comparator를 TreeSet 생성자로 안넣어도 된다.
class Test implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
class TestComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
// TreeSet은 비교 기준이 필요하기 때문에 둘중 하나를 해야한다.
// 1.비교 객체가 Comparable을 가지고 있던가
// 2.TreeSet이 비교 기준을 가지고 있던지 (생성자로)

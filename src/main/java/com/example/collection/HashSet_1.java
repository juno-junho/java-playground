package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set); // 어떤것이 Integer 1인지는 정확히 알수 없다.

        // HashSet에 저장된 요소들을 출력한다.(Iterator이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {    // 읽어 올 요소가 있는지 확인
            System.out.println(it.next()); // 요소 하나 꺼내오기. 순서 유지되는것 처럼 보이지만 순서 유지 x
        }
    }
}

package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.*; // Collections를 생략 가능 하게 해줌.

public class Collections1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);  // 반시계 방향으로 두번 회전
        System.out.println(list);

        swap(list, 0, 2); // 첫 번째와 세 번째를 교환(swap)
        System.out.println(list);

        shuffle(list);    // 저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list, reverseOrder()); // 역순 정렬 reverse(list);와 동일
        System.out.println(list);

        sort(list);       // 정렬 항상 정렬 먼저해야 bindarySerach 사용 가능
        System.out.println(list);

        int idx = binarySearch(list, 3);  // 3이 저장된 위치(index)를 반환
        System.out.println("index of 3 = " + idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));
        System.out.println("min="+max(list, reverseOrder()));   // 이렇게 쓸수도 있다.

        fill(list, 9); // list를 9로 채운다.
        System.out.println("list="+list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList="+newList);

        System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true. 공통요소 확인하는것이 disjoint

        copy(list, newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list, 2, 1);
        System.out.println("list="+list);

        Enumeration e = enumeration(list); //Iterator와 같은 것. 자주쓰이는것은 아님.
        ArrayList list2 = list(e);

        System.out.println("list2="+list2);
    }
}

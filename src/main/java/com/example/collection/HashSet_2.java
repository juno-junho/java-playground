package collection;

import java.util.*;

public class HashSet_2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45 사이의 난수를 저장.
        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

        List list = new LinkedList(set); // LinkedList(Collection c). 1) Set의 모든 요소를 list에 저장.
        Collections.sort(list);          // Collections.sort(List list) Set은 정렬할수 없다. sort의 매개변수로 List만 올수 있음.
        // 순서 유지가 되어야 하기 때문에. 2) list 정렬
        System.out.println(list); // 3) list 출력
    }
}

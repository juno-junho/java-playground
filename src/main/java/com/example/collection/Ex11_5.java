package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Collection c = new HashSet(); // set은 collection의 자손

        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");


        // 값 가지고 오는 방법 1.
        Iterator it = c.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
//        while(it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }
        // Iterator는 변수가 있어서 다음에 읽어올 것을 가리키고 있다.
        // 끝까지 가고 나면 더이상 읽어 올것이 없기 때문에 iterator를 다시 얻어와야한다.
        // ITERATOR는 일회용이다.!

        // 값 가지고 오는 방법 2.
//        for (int i = 0; i < list.size() ; i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
        // 만약 ArrayList를 HashSet으로 바꾸면,
        // hashset에는 get이 없다. 따라서 에러발생
        // Iterator를 이용해 요소를 가져오게 하면 상관없다. 표준화 되어 있기 때문에.

    } // main
}
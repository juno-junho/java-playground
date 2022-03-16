package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_4 {
    public static void main(String args[]) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");	 setA.add("2");  setA.add("3");
        setA.add("4");  setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");	 setB.add("5");  setB.add("6");
        setB.add("7");  setB.add("8");
        System.out.println("B = "+setB);

        // 교집합
        Iterator it = setA.iterator(); // setA와 setB가 바뀌어도 상관 x
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setB.contains(tmp))
                setKyo.add(tmp);
        }
//        setA.retainAll(setB); // 교집합

        // 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }
//        setA.removeAll(setB);   // 차집합. setA에서 setB와 공통요소 제거

        //합집합
        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());

//        setA.addAll(setB); //합집합
        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A U B = " + setHab);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + setCha);
    }
}
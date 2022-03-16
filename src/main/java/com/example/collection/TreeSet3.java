package collection;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();    // 앞의 TreeSet을 Set으로 바꾸면 안된다.
        // 아래 메소드들은 TreeSet에만 존재하는 메소드이기 때문에.
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i=0; i < score.length; i++)
            set.add(new Integer(score[i]));

        System.out.println(set);
        System.out.println("50보다 작은 값 :" + set.headSet(new Integer(50)));
        System.out.println("50보다 큰 값 :"  + set.tailSet(new Integer(50)));
        System.out.println("40과 80사이의 값 :" + set.subSet(40,80));
    }
}

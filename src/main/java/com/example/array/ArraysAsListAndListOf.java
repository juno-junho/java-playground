package com.example.array;

import java.util.Map;

public class ArraysAsListAndListOf {

    public static void main(String[] args) {
        // Arrays.asList, List.of 차이점
/*        List<Integer> asList = Arrays.asList(new Integer(1), new Integer(3));
        List<Integer> listOf = List.of(new Integer(1), new Integer(4), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1));
        asList.set(0, 3);
        System.out.println(asList);
        listOf.set(0, 3);
        System.out.println(listOf);*/
        // map of
        Map<Integer, String> integerStringMap = Map.of(1, "hello1",
                2, "hello2",
                3, "hello3",
                4, "hello4",
                5, "hello5",
                6, "hello6",
                7, "hello7",
                8, "hello8",
                9, "hello9",
                10, "hello10"
//                ,11, "hello11"  // 10개 까지만 가능
        );
//        integerStringMap.put(11, "hello11"); // Immutable 객체로 인한 UnsupportedOperationException 발생

        // 11 개 이상일 경우
        Map<Integer, String> integerStringMap1 = Map.ofEntries(
                Map.entry(1, "hello1"),
                Map.entry(2, "hello2"),
                Map.entry(3, "hello3"),
                Map.entry(4, "hello4"),
                Map.entry(5, "hello5"),
                Map.entry(6, "hello6"),
                Map.entry(7, "hello7"),
                Map.entry(8, "hello8"),
                Map.entry(9, "hello9"),
                Map.entry(10, "hello10"),
                Map.entry(11, "hello11"),
                Map.entry(12, "hello12"),
                Map.entry(13, "hello13"),
                Map.entry(14, "hello14"),
                Map.entry(15, "hello15")
        );
//        integerStringMap1.put(16, "hello16");
    }
}

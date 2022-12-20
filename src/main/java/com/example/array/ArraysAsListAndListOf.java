package com.example.array;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListAndListOf {

    public static void main(String[] args) {
        // Arrays.asList, List.of 차이점
        List<Integer> asList = Arrays.asList(new Integer(1), new Integer(3));
        List<Integer> listOf = List.of(new Integer(1), new Integer(4), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1), new Integer(1));
        asList.set(0, 3);
        System.out.println(asList);
        listOf.set(0, 3);
        System.out.println(listOf);
    }
}

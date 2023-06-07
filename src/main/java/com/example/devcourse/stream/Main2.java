package com.example.devcourse.stream;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3)
                .stream();
        Integer[] array = Arrays.stream(new int[]{1, 2, 3}).boxed().toArray(Integer[]::new);

    }
}

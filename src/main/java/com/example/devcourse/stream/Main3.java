package com.example.devcourse.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

class Main3 {
    public static void main(String[] args) {

        // 주사위를 100번 던져서 6이 나올 확률을 구하시오
        Random random = new Random();
     /*   long count = Stream.generate(() -> random.nextInt(6) + 1)
                .limit(100)
                .filter(i -> i == 6)
                .count();

        System.out.println(count);*/

        // 0 ~ 200 사이 값 중에서 랜덤 값 5개를 뽑아 순서대로 표시하시오
        int[] array = Stream.generate(() -> random.nextInt(201))
                .limit(5)
                .sorted()
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(array));


    }
}

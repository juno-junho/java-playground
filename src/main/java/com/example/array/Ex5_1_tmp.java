package array;

import java.util.Arrays;

public class Ex5_1_tmp {
    public static void main(String[] args) {
        int[] score;    // 1. 배열 score 선언(참조변수)
        score = new int[5]; // 2. 배열의 생성(int 저장공간 x 5)

        int[] score1 = new int[5]; // 배열의 선언과 생성을 동시에.
        score1[3] = 100;

        System.out.println("score[0] = " + score1[0]);
        System.out.println("score[1] = " + score1[1]);
        System.out.println("score[2] = " + score1[2]);
        System.out.println("score[3] = " + score1[3]);
        System.out.println("score[4] = " + score1[4]);

        int value = 100;
        System.out.println("value = " + value);

        int[] iArr = {100, 95, 80, 75, 65};
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
        System.out.println("----------");
        System.out.println(Arrays.toString(iArr));

    }
}

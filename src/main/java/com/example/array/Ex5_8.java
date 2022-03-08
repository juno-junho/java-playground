package array;

public class Ex5_8 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 }
                , { 20, 20, 20 }
                , { 30, 30, 30 }
                , { 40, 40, 40 }
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) { // score[0].length라 해도 상관 없음. but 정사각형이여야 함.
                // 각 i에 따라서  j를 for문 돌림 (행 : i-1, 열 : j-1)
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }

        System.out.println("sum=" + sum);
    }
}
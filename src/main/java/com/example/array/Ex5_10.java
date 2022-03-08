package array;

import java.util.Scanner;

public class Ex5_10{
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"},      	// words[0][0], words[0][1]
                {"computer","컴퓨터"}, 	// words[1][0], words[1][1]
                {"integer","정수"}     	// words[2][0], words[2][1]
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                // %n은 printf에서만 쓰이는 줄바꿈. \n써도됨. 하지만 os마다 다르다. java는 os에 독립적이기 때문에 %n을 쓰면 어떤 os든 적용된다.
                // (%n을 쓰는게 나음)
                // %s : 믄지열 출력지시자.
                // %d : 숫자. 정수.

            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
            }
        } // for
    } // main의 끝
}
package array;

import java.util.Arrays;

public class Rockscissorpaper {
    public static void main(String[] args) {
    String[] strings = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length ; i++) {
            int tmp = (int)(Math.random()*3);
            System.out.println(strings[tmp]);
        }
        System.out.println(Arrays.toString(args));
    }
}

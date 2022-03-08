package array;

import java.util.Arrays;

public class Ex_Arrays_01 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][]arr2D = {
                {11,12},
                {21,22}
        };
        //출력
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {
                {"aaa", "bbb"},
                {"AAA","BBB"}
        };
        String[][] str2D2 = {
                {"aaa", "bbb"},
                {"AAA","BBB"}
        };
        //비교
        System.out.println(str2D == str2D2); // 참조변수 값을 비교하는 것. 서로다른 배열이기 때문에 절대 겹칠 수 없다.
        System.out.println(Arrays.deepEquals(str2D,str2D2));
        System.out.println(Arrays.deepEquals(str2D2,str2D));

        // 배열의 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr 전체 복사
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // 배열 정렬
        int[] arr4 = {3,4,1,0,8,6,6};
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4); // 오름차순으로 배열 정렬
        System.out.println(Arrays.toString(arr4));




    }
}

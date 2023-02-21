package programers.lv0;

import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

    }

    // 주어진 array의 중앙값 구하기
    static int solution(int[] array) {
        int answer;

        Arrays.sort(array);

        int size = array.length;

        if (size % 2 == 0) {
            answer = (array[size / 2] + array[(size / 2) - 1]) / 2;
        } else {
            answer = array[size / 2];
        }
        return answer;
    }
}

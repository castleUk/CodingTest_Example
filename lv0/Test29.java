package programers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class Test29 {
    public static void main(String[] args) {

    }


    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    //numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    static int[] solution(int[] numbers, int num1, int num2) {
        int range = num2-num1+1;
        int[] answer = new int[range];
        System.arraycopy(numbers, num1, answer, 0, range);
        return answer;
    }
}

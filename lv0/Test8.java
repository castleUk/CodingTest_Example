package programers.lv0;

public class Test8 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        solution(num);

    }

    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

}

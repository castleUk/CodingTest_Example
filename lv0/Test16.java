package programers.lv0;

public class Test16 {

    public static void main(String[] args) {
        int[] arrays = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(solution(arrays));

    }

    static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        answer = (sum * 1.0) / numbers.length;

        return answer;
    }

}

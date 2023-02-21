package programers.lv0;

public class Test23 {

    public static void main(String[] args) {

    }

    // 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중
    // 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;

        for (int list : num_list) {
            if (list % 2 == 0) {
                a += 1;
            } else {
                b += 1;
            }
        }
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}
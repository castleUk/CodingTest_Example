package programers.lv0;

public class Test14 {
    public static void main(String[] args) {

        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));

    }

    static int solution(int n) {
        int answer = 0;
        if (n % 6 == 0) {
            answer = n / 6;
        } else {
            for (int i = 1; i < 101; i++) {
                int a = (n * i) % 6;
                if (a == 0) {
                    answer = (n * i) / 6;
                    break;
                }
            }
        }

        return answer;
    }

}

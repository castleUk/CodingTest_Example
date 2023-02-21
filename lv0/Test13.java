package programers.lv0;

public class Test13 {

    public static void main(String[] args) {

    }

    // 피자는 7조각 사람수는 n 모든 사람이 한조각 이상 먹으려면?
    static int solution(int n) {
        int answer = 0;

        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = (n / 7) + 1;
        }

        return answer;
    }

}

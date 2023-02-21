package programers.lv0;

public class Test17 {

    public static void main(String[] args) {

    }
    // 머쓱이네 옷가게는 10만 원 이상 사면 5%,
    // 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.

    static int solution(int price) {
        int answer = price;

        if (price >= 100000) {
            answer = (int) (price * 0.95);
        }
        if (price >= 300000) {
            answer = (int) (price * 0.9);
        }
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        }
        return answer;
    }

}

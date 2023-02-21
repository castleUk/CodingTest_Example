package programers.lv0;

public class Test18 {

    public static void main(String[] args) {

    }

    // 아이스 아메리카노는 한잔에 5,500원입니다.
    // 가지고 있는 돈 money가 매개변수로 주어질 때,
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}

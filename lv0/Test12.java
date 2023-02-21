package programers.lv0;

public class Test12 {

    public static void main(String[] args) {

    }

    // 홀수만 배열에 담기
    static int[] solution(int n) {
        // 반쪽짜리 배열을 만들고
        int[] answer = new int[(n + 1) / 2];

        // 2로 나눈 나머지가 1인것만 담는다
        for (int i = 1; i <= answer.length; i++) {
            if (i % 2 == 1) {
                answer[i / 2] = i;
            }
        }

        return answer;

    }
}

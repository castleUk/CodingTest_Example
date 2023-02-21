package programers.lv0;

public class Test7 {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 두수의 합
        int 분모 = denom1 * denom2;
        int 분자 = denom1 * numer2 + denom2 * numer1;

        // 최대공약수 구하기
        int 최대공약수 = eucd(분모, 분자);

        int[] answer = { 분자 / 최대공약수, 분모 / 최대공약수 };

        return answer;
    }

    static int eucd(int bn, int sn) {
        // 큰숫자를 작은숫자로 나눈 나머지를 계산
        int r = bn % sn;
        // 나머지가 0이면 작은숫자가 최대공약수이므로 작은숫자 리턴
        if (r == 0) {
            return sn;
        } else {
            // 나머지가 0 이상이면 재귀형태로 호출
            // 이때 파라미터는 작은숫자와 나머지를 넣어줌
            return eucd(sn, r);

        }
    }

}

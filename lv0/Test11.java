package programers.lv0;

public class Test11 {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 3, 3, 4 };
        System.out.println(solution(array));

    }

    static int solution(int[] array) {

        int answer = 0;
        int[] ary = new int[1001]; // 0<=array의 원소 <1000

        for (int i = 0; i < array.length; i++) { // 원소 갯수 ary에 저장
            ary[array[i]]++;
        }

        int max = 0; // 최빈값의 갯수
        int max_index = 0; // 최빈값

        // 최빈값 구하기
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
                max_index = i;
            }
        }

        int count = 0;

        // 최빈값 2개 인지 확인
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == max) {
                count++;
            }
            if (count > 1) {
                return answer - 1;
            }
        }

        answer = max_index;
        return answer;

    }
}

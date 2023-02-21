package programers.lv0;

public class Test15 {

    public static void main(String[] args) {

    }

    static int solution(int slice, int n) {
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }

        return answer;
    }

}

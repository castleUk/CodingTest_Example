package programers.lv0;


import java.util.Objects;

public class Test36 {
    public static void main(String[] args) {

    }

    //머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    //머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    //balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
    public int combination(int n, int m){
        if(m == 0 || n == m){
            return 1;
        }else{
            return combination(n-1, m-1) + combination(n-1, m);
        }
    }

    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
}
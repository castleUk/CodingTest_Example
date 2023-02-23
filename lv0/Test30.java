package programers.lv0;

public class Test30 {
    public static void main(String[] args) {

        System.out.println(solution(23));
    }

    //나이를 알파벳으로 말하고 있습니다.
    //a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    //나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
    static String solution(int age) {
        String answer = "";
        String number = String.valueOf(age);
        String[] arr = number.split("");

        for(int i =0; i<arr.length; i++){
            answer += ((char)((Integer.parseInt(arr[i])+97)));
        }
        return answer;
    }
}

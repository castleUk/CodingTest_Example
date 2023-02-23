package programers.lv0;

public class Test25 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "b";

        System.out.println(solution(a,b));

    }

    //문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    //my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    static String solution(String my_string, String letter) {
        StringBuilder sol = new StringBuilder();
        String answer;
        for (int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)){
                sol.append(my_string.charAt(i));
            }
        }
        answer = sol.toString();
        return answer;
    }
}

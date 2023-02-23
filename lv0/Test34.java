package programers.lv0;

import java.util.Map;
import java.util.Objects;

public class Test34 {
    public static void main(String[] args) {

        String a = ".... . .-.. .-.. ---";
        System.out.println(solution(a));


    }

    static String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] arr = letter.split(" ");
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (Objects.equals(arr[i], morse[j])) {
                    answer += (char)(j+97);
                }
                }
            }
        return answer;
    }
}

package programers.lv0;

import java.util.Scanner;

public class Test22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 별 찍기 삼각형 만들기
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
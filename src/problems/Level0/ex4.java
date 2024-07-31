package problems.Level0;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        /*
        * 문제 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
        *
        * 제한사항 :
        * 1 ≤ str의 길이 ≤ 20
            * str은 알파벳으로 이루어진 문자열입니다.
         * */

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toUpperCase();

        System.out.println(b);

    }
}

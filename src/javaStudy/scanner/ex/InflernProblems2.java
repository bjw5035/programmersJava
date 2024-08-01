package javaStudy.scanner.ex;

import java.util.Scanner;

public class InflernProblems2 {

    public static void main(String[] args) {

        /*
        * 문제와 풀이 2
        * 문제 - 홀수 짝수
        * 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하시오
        *
        * 실행 결과 예시
        * 하나의 정수를 입력하세요 : 1
        * 입력한 숫자 1은 홀수 입니다.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("입력한 숫자 " + num1 + "은 짝수입니다.");
        } else if (num1 % 2 == 1) {
            System.out.println("입력한 숫자 " + num1 + "은 홀수입니다.입니다.");

        }
    }
}

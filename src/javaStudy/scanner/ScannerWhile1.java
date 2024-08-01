package javaStudy.scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력이 될때까지 반복
        while (true) {
            System.out.print("문자열을 입력하세요(Exit:종료) : ");
            String str = scanner.nextLine();
            if (str.equals("종료") || str.equals("Exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }

}

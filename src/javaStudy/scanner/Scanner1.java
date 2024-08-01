package javaStudy.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다
        System.out.println("입력한 문자열 : " + str);

        System.out.printf("정수를 입력하세요 : ");
        int value = scanner.nextInt();
        System.out.println("입력한 정수 : " + value);

        System.out.printf("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + value);
    }

}

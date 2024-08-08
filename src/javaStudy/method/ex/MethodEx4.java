package javaStudy.method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("선택 : ");
            
            int choice = scanner.nextInt();
            int amount;
            
            switch (choice) {
                case 1:
                    System.out.println("입금액을 입력하세요: ");
                    amount = scanner.nextInt();

                case 2:
                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    return;
                default:
            }
        }
    }

}

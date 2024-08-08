package javaStudy.method;

public class MethodValue1 {

    public static void main(String[] args) {

        int num1 = 5;
        System.out.println("changeNumber 호출 전 : " + num1);
        changeNumber(num1);
        System.out.println(num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("changeNumber 변경 전 : " + num2);
        num2 = num2 * 2;
        System.out.println(num2);
    }

}

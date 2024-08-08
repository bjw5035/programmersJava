package javaStudy.method;

public class MethodValue2 {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("changeNumber 호출 전 : " + number);
        number = changeNumber(number);
        System.out.println(number);
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }

}

package javaStudy.method;

public class MethodReturn2 {

    public static void main(String[] args) {

        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age);
            return;
        }

        System.out.println(age + "테스트");
    }

}

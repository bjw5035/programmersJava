package javaStudy.scope;

public class Scope1 {

    public static void main(String[] args) {

        int n = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + n);
        }
    }

}

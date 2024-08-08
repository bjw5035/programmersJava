package javaStudy.method;

public class MethodReturn1 {

    public static void main(String[] args) {

        boolean result = add(2);
        System.out.println(result);
    }

    public static boolean add(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

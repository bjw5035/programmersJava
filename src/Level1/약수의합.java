package Level1;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;

        if (n % n == 0) {
            n = n + 1;
            System.out.println(n);
            return n;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}

package problems.Level1;

public class x만큼간격이있는n개의숫자 {
    /*
    * 문제 설명
    * 함수 solution은 정수 x와 자연수 n을 입력 받아,
    * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    *
    * 제한 조건
    * x는 -10000000 이상, 10000000 이하인 정수입니다.
    * n은 1000 이하인 자연수입니다.
    * */

    public long[] solution(int x, int n) {
        // 입력받은 n은 개수이니 배열의 크기로 설정해준다.
        long[] answer = new long[n];

        // for문을 이용하여 배열의 자릿수만큼 반복한다.(i < n;의 조건문은 i<answer.length;와 동일)
        for (int i = 0; i < n; i++) {
            // answer배열의 0번 인덱스부터 (i+1) * x 를 대입해 주면, 출력 결과처럼 입력받은 x만큼 증가하여 출력된다.
            // (i + 1) * x 앞에 (long)형으로 형변환 해줘야함.
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }
}

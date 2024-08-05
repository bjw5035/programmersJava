package javaStudy.array;

public class ArrayDi4 {

    public static void main(String[] args) {

        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                arr[row][colum] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

    }

}

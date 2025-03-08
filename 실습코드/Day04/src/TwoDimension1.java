public class TwoDimension1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 2차원 배열 선언과 동시에 초기화
        // arr[0] = {1, 2, 3} : 첫번째 행의 값
        // arr[1] = {4, 5, 6} : 두번째 행의 값
        for (int i = 0; i < arr.length; i++) { // 행 0, 1
            // arr.length 행(row)의 길이
            for (int j = 0; j < arr[i].length; j++) { // 열 0, 1, 2
                // arr[i].length는 현재 행의 열 길이
                System.out.println(arr[i][j]);
            }
            System.out.println(); // 행 출력이 끝난 후 한줄 띄우기
        }
    }
}

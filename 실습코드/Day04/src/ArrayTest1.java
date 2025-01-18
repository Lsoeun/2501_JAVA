import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] student = new int[] {101, 102, 103}; // student라는 이름의 크기가 3인 정수 배열을 선언하고, 그 배열에 초기값으로 101, 102, 103을 저장
        
        int[] studentId = new int[10]; // int형이면서 요소가 10개인 배열 선언(배열명은 studentId)
        studentId[0] = 10; // -> 배열의 첫번째 요소[0]에 값 10을 저장

        // student 배열의 값 출력
        for (int i = 0; i < student.length; i++) {
            System.out.println("student:" + student[i]);
        }

        System.out.println(); // 줄 띄우기 용도

        // studentId 배열의 값 출력(for문 사용)
        for (int i = 0; i < studentId.length; i++) {
            System.out.println("studentId:" + studentId[i]);
        }

        System.out.println(); // 줄 띄우기 용도

        // student 배열 출력
        System.out.println(Arrays.toString(student));

        // studentId 배열 출력
        System.out.println(Arrays.toString(studentId));
    }
}

// Arrays -> 배열과 관련된 다양한 작업을 편리하게 처리할 수 있도록 도와주는 도구 클래스
// Arrays.toString() -> 배열을 [요소1, 요소2, 요소3...] 형식으로 표현

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] student = new int[]{101, 102, 103};

        int[] studentID = new int[10];

        studentID[0] = 10; // 배열의 첫번째 요소[0]에 값 10을 저장

        // student 배열의 값 출력
        for (int i = 0; i < student.length; i++) {
            System.out.println("student:" + student[i]);
        }
        System.out.println(); // 줄 띄우기 용도

        for (int i = 0; i < studentID.length; i++) {
            System.out.println("StudentID: " + studentID[i]);
        }
        System.out.println(); // 줄 띄우기

        // student 배열 출력
        System.out.println(Arrays.toString(student));

        // studentID 배열 출력
        System.out.println(Arrays.toString(studentID));
    }
}

// Arrays -> 배열과 관련된 다양한 작업들을 편하게 처리할 수 있도록 도와주는 도구
// Arrays.toString() -> 배열을 [요소1, 요소2] 형식으로 표현

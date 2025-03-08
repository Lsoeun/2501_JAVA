import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    // 파일 입출력에서 발생하는 예외 처리
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("해당 파일이 없습니다.");
        }
        System.out.println("여기도 수행됩니다!");
    }
}

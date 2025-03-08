import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt"); // 파일을 열기 위한 리소스
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally { // 예외가 발생하든 발생하지 않은 무조건 실행
            if(fis != null) {
                try {
                    fis.close(); // 파일 리소스를 닫는 close() 메서드
                    System.out.println("파일 리소스 닫힘!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("항상 수행됩니다!");
        }
    }
}

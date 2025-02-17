import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
        Class c = Class.forName(className); // ClassNotFoundException 발생 가능
        return c;
    }
    public static void main(String[] args) {
        ThrowsException2 test = new ThrowsException2();
        try {
            test.loadClass("a.txt", "Person");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { // Exception  클래스로 그 외의 예외 상황 처리
            // 여러 예외 처리 블록의 가장 아래에 놓여야 함!!
            e.printStackTrace();
        }
    }
}
import java.util.Objects;

public class Book2 {
    int bookNumber;
    String bookTitle;

    public Book2 (int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() { // toString() 메서드 재정의
        return "책 제목:" + bookTitle + ", 책 번호:" + bookNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book2 book2 = (Book2) o;
        return bookNumber == book2.bookNumber && Objects.equals(bookTitle, book2.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookNumber, bookTitle);
    }

    public static void main(String[] args) {
        Book2 book2 = new Book2(100, "개미");
        System.out.println(book2);
        System.out.println(book2.toString());
        System.out.println(book2.hashCode()); // 해시코드 확인
        System.out.println(System.identityHashCode(book2)); // 해시코드 확인
    }
}

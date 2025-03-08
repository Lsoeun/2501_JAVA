public class BookPerson {
    // 속성
    String name;
    Book book; // BookPerson 객체가 소유하는 책

    // 기능 : 책을 읽는 동작
    public void readBook() {
        book.read();
        // Book 객체의 read() 메서드 호출
    }
}

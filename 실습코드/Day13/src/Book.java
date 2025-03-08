public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    public static void main(String[] args) {
        Book book1 = new Book(100, "개미");
        System.out.println(book1);
        System.out.println(book1.toString());

        String str = new String("안녕하세요");
        System.out.println(str);
        Integer i1 = new Integer(100);
        System.out.println(i1);
    }
}

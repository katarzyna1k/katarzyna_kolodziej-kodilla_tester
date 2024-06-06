public class Book {
    private String author;
    private String title;

    static Book of(String author, String title) {
        return new Book(author, title);
    }

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        String upperCaseAuthor = author.toUpperCase();
        return upperCaseAuthor;

    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "Fundation");

        book.getAuthor();
        book.getTitle();

        Book anotherBook = Book.of("Jarosław Grzędowicz", "Pan lodowego ogrodu");
        anotherBook.getAuthor();
        anotherBook.getTitle();


        System.out.println(book.getAuthor() + " " + book.getTitle());
        System.out.println(anotherBook.getAuthor() + " " + anotherBook.getTitle());
    }
}

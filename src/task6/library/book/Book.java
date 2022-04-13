package task6.library.book;

import java.util.Scanner;

public class Book {
    private BookType bookType;
    private String author;
    private String title;
    private String description;

    public Book(BookType bookType, String author, String title, String description) {
        this.bookType = bookType;
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static Book bookCreateFromConsole(){
     BookType bookType;
     String author;
     String title;
     String description;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите тип книги DIGITAL_BOOK или PAPER_BOOK");
    bookType = BookType.valueOf(scanner.nextLine());
    System.out.println("Введите автора книги");
    author = scanner.nextLine();
    System.out.println("Введите название книги");
    title = scanner.nextLine();
    System.out.println("Введите описания книги");
    description = scanner.nextLine();
    return new Book(bookType,author,title,description);


}
    @Override
    public String toString() {
        return "Book{" +
                "bookType=" + bookType +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}

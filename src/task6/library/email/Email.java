package task6.library.email;

import task6.library.book.Book;

public class Email {
    private String name;
    private Book book;

    public Email(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Email{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}

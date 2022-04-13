package programmingWithClasses.simplestClassesAndObjects.book;

import programmingWithClasses.simplestClassesAndObjects.customer.Customer;

public class AggregateArrayBook {
    private Book[] books;

    public AggregateArrayBook(Book[] books) {
        this.books = books;
    }

    public void listBookAuthor(String author){
        for (Book k : books) {
            if (k.getAuthor().equals(author)){
                System.out.println(k);
            }
        }
    }
    public void listBookPublisher(String publisher){
        for (Book k : books) {
            if (k.getPublisher().equals(publisher)){
                System.out.println(k);
            }
        }
    }
    public void listBookYearPublication(int publication){
        for (Book k : books) {
            if (k.getYearPublication() >=publication){
                System.out.println(k);
            }
        }
    }

}

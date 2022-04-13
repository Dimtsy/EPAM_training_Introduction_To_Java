package programmingWithClasses.simplestClassesAndObjects.book;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearPublication;
    private int numberPages;
    private int price;
    private String typeBinding;

    public Book(int id, String title, String author, String publisher, int yearPublication, int numberPages, int price, String typeBinding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
        this.numberPages = numberPages;
        this.price = price;
        this.typeBinding = typeBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(String typeBinding) {
        this.typeBinding = typeBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublication=" + yearPublication +
                ", numberPages=" + numberPages +
                ", price=" + price +
                ", typeBinding='" + typeBinding + '\'' +
                '}';
    }
}

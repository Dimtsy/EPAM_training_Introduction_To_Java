package programmingWithClasses.simplestClassesAndObjects.book;
//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
public class Main {
    public static void main(String[] args) {
Book[] books = new Book[]{new Book(1, "Рамео и Джульета", "Шекспир",
        "Дом печати Петроград", 1886, 500, 800, "Черный"),
        new Book(2, "Маленткий принц", "Экзюпери",
                "Дом печати Лондон", 1950, 60, 500, "белый"),
        new Book(3, "Рамео и Джульета", "Шекспир",
                "Дом печати Петроград", 1886, 500, 800, "Черный"),
        new Book(4, "Маленткий принц", "Экзюпери",
                        "Дом печати Лондон", 1950, 60, 500, "белый")
        };

AggregateArrayBook aggregateArrayBook = new AggregateArrayBook(books);
        System.out.println();
aggregateArrayBook.listBookPublisher("Дом печати Петроград");
        System.out.println();
aggregateArrayBook.listBookYearPublication(1900);
        System.out.println();
aggregateArrayBook.listBookAuthor("Экзюпери");
 }
}

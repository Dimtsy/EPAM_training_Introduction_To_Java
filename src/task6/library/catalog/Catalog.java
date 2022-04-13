package task6.library.catalog;


import task6.library.book.Book;
import task6.library.book.BookType;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    private ArrayList<Book> bookArrayList = new ArrayList<>();
    private String fileName = "booksLibrary.txt";

    public Catalog() {
        readeCatalogFromFile();
    }
    public void addBook(Book book){
        bookArrayList.add(book);
        writeBookFile(book);
    }
    public void consoleOutputCatalog(){
        bookArrayList.forEach(p-> System.out.println(bookArrayList.indexOf(p)+" "+
                p.getTitle()));

        while (true){
            int index;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Для выбора книги введите ее номер или exit для выхода");
                while (!scanner.hasNextInt()){
                    if (scanner.nextLine().equals("exit")){
                        return;
                    }
                }
                index = scanner.nextInt();

            }while (index<0||index>bookArrayList.size()-1);

            System.out.println(bookArrayList.get(index));
        }
    }

    public void writeBookFile(Book book){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){
            writer.write(book.getTitle()+"|"+book.getDescription()+"|"+book.getAuthor()+"|"+book.getBookType());
            writer.newLine();

        }catch (IOException e){
            System.out.println("Ошибка при записи в книги в файл");

        }
    }
    public void readeCatalogFromFile(){
         BookType bookType;
         String author;
         String title;
         String description;

         try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
             String line;
             String[] buffer;

             while ((line=bufferedReader.readLine())!=null){
                 buffer=line.split("\\|");
                 if (buffer.length>1) {
                     bookType = BookType.valueOf(buffer[3]);
                     author = buffer[2];
                     title = buffer[0];
                     description = buffer[1];
                     bookArrayList.add(new Book(bookType, author, title, description));
                 }

             }

         }catch (IOException e){
             System.out.println("Ошибка при чтении книг из файла");
         }

    }

    public Book findBook(String title){
//возвращает первый найденный объект или null усли колекция пуста
        return bookArrayList.stream().filter(p->p.getTitle().equals(title)).findFirst().orElse(null);


    }
}

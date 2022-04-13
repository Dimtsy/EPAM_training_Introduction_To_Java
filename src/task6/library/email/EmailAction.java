package task6.library.email;

import task6.library.book.Book;
import task6.library.book.BookType;

import java.io.*;
import java.util.ArrayList;

public class EmailAction {
    private ArrayList<Email> emailArrayList = new ArrayList<>();
    private String fileName = "emails.txt";

    public EmailAction() {
        readEmail();
    }

    public void sentEmailToAdmin(String login, Book book){
        writeEmail(book, login);
        emailArrayList.add(new Email(login,book));
        System.out.println("Email отправлен админу");

    }
    public void cleanFile(){
        File file = new File(fileName);
        if(file.isFile()&&file.exists()){
            System.out.println("файл существует");
            file.delete();
            emailArrayList.clear();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void printEmails(){
        if(emailArrayList.isEmpty()){
            System.out.println("Почта пуста");
        }else {
            emailArrayList.forEach(p-> System.out.println("Емаил от: "+p.getName()+"\nСодержание письма: "+p.getBook()));
        }
    }

    public void writeEmail(Book book, String login){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true))){
            bufferedWriter.write(login+"|"+book.getBookType()+"|"+book.getAuthor()
                    +"|"+book.getTitle()+"|"+book.getDescription());
            bufferedWriter.newLine();

        }catch (IOException e) {
            System.out.println("Ошибка записи емейла в файл");
        }
    }
    public void readEmail(){
        String[] buffer;
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while ((line = bufferedReader.readLine())!=null){
                buffer = line.split("\\|");
                if (buffer.length>1) {

                    emailArrayList.add(new Email(buffer[0], new Book(BookType.valueOf(buffer[1])
                            , buffer[2], buffer[3], buffer[4])));
                }
            }

        }catch (IOException e) {
            System.out.println("Ошибка чтения емейла из файл");
        }
    }
}

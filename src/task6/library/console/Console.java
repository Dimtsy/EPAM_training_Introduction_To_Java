package task6.library.console;

import task6.library.book.Book;
import task6.library.catalog.Catalog;
import task6.library.email.EmailAction;
import task6.library.user.User;

import java.util.Scanner;

public class Console {
    private EmailAction emailAction = new EmailAction();
    private Scanner scanner = new Scanner(System.in);
    private Catalog catalog = new Catalog();

    public void getConsole(User user){
        System.out.println(user.isAdmin());
        if(user.isAdmin()){
            adminConsole(user);
        }else {
            userConsole(user);
        }
    }

    public void userConsole(User user) {
        int choice;
        while (true) {
            do {
                System.out.println("1 - Просмотреть книги в каталоге\n" +
                        "2 - Поиск книги в каталоге\n" +
                        "3 - Предложить добавить книгу\n" +
                        "0 - Выход из библиотеки\n");
             while (!scanner.hasNextInt()){
                 scanner.next();
             }
             choice = scanner.nextInt();

            }while (choice<0||choice>3);
            switch (choice){
                case 0:
                    return;
                case 1:
                    catalog.consoleOutputCatalog();
                    break;
                case 2:
                    System.out.println("Введите название книги");
                    Scanner scanner1 = new Scanner(System.in);
                    String title = scanner1.nextLine();
                    Book book = catalog.findBook(title);
                    if(book!=null){
                        System.out.println(book);
                    }else {
                        System.out.println("Книга с таким названием не найдена");
                    }
                    break;

                case 3:
                    emailAction.sentEmailToAdmin(user.getLogin(),Book.bookCreateFromConsole());
                    break;
                default:
                    System.out.println("ошибка");

            }
        }

    }
    public void adminConsole(User user) {
        int choice;
        while (true) {
            do {
                System.out.println("1 - Просмотреть книги в каталоге\n" +
                        "2 - Добавить книгу в каталог\n" +
                        "3 - Проверить почту\n" +
                        "4 - Очистить почту\n" +
                        "0 - Выйти\n");
                while (!scanner.hasNextInt()){
                    scanner.next();
                }
                choice = scanner.nextInt();

            }while (choice<0||choice>4);
            switch (choice){
                case 0:
                    return;
                case 1:
                    catalog.consoleOutputCatalog();
                    break;
                case 2:
                    catalog.addBook(Book.bookCreateFromConsole());
                    System.out.println("Книга добавлена");
                    break;

                case 3:
                    emailAction.printEmails();
                    break;
                case 4:
                    emailAction.cleanFile();
                    break;
                default:
                    System.out.println("ошибка");

            }
        }
    }

}

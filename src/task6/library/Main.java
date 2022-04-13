package task6.library;

import task6.library.authorization.Authorization;
import task6.library.console.Console;
import task6.library.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        User user;

        Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("1 - Log In"+ "\n2 - Sign Up");
           while (!scanner.hasNextInt()){
               scanner.next();
           }
           choice=scanner.nextInt();

       }while (choice!=2&&choice!=1);
        Authorization authorization = new Authorization();
        Console console = new Console();

        switch (choice){
            case 1:
                user = authorization.logIn();
                console.getConsole(user);
                break;
            case 2:
                user = authorization.signUp();
                console.getConsole(user);
                break;
            default:
                System.out.println("Ошибка");
                break;

        }




    }
}

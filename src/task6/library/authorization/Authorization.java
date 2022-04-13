package task6.library.authorization;

import task6.library.user.User;

import java.util.Scanner;

public class Authorization {
    private Scanner scanner = new Scanner(System.in);
    private User user;
    private UserData userData = new UserData();

    public User logIn(){
        String login;
        String password;

        while (true) {
            System.out.println("Введите логин:");
            login = scanner.nextLine();
            System.out.println("Введите пароль:");
            password = scanner.nextLine();

            if ((user = userData.userVerification(login, password)) == null) {
                System.out.println("Вы ввели не верный логин или пароль");
            }else {
                System.out.println("Добро пожвловать вы вошли в систему под логином "+user.getLogin());
                return  user;
            }
        }

    }
    public User signUp(){
        String login;
        String password;
        boolean admin;

        System.out.println("Введите логин:");
        login = scanner.nextLine();
        while (userData.loginBoolean(login)){
            System.out.println("Такой логин уже есть введите другой");
            login = scanner.nextLine();
        }
        System.out.println("Введите пароль:");
        password = scanner.nextLine();
        System.out.println("Если вы админ то введите true, если нет false:");
        while (!scanner.hasNextBoolean()){
            System.out.println("true/false");
            scanner.next();
        }
        admin = scanner.nextBoolean();
        return userData.registrationUser(login,password,admin);

    }
}

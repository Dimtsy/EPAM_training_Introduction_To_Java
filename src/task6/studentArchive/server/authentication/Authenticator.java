package task6.studentArchive.server.authentication;
import task6.studentArchive.server.console.Console;
import task6.studentArchive.server.user.User;
import task6.studentArchive.server.user.UserHandler;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
public class Authenticator {
    private UserHandler userHandler = UserHandler.getInstance();
    private User user;
    private Console console = Console.getInstance();

    public Authenticator() throws IOException, XMLStreamException {
    }

    public User logIn() throws IOException {
        while (true) {
            String userName = console.sendCommandWithResponse("Введите свое имя");
            String password = console.sendCommandWithResponse("Введите свой пароль");

            user = userHandler.isLoginCorrect(userName, password);

            if (user != null) {
                console.sendCommand("Поздравляем, вы вошли в систему!");
                return user;
            } else {
                console.sendCommand("Имя пользователя или пароль неверны, попробуйте еще раз");
            }
        }
    }

    public User signUp() throws IOException, XMLStreamException {
        while (true) {
            String userName = console.sendCommandWithResponse("Введите имя пользователя");
            if (userHandler.isUsernameTaken(userName)) {
                console.sendCommand("Это имя занято, попробуйте другое");
            } else {
                String password = console.sendCommandWithResponse("Введите пароль");
                boolean isAdmin = Boolean.parseBoolean(console.sendCommandWithResponse("Вы админ? (true|false)"));

                return userHandler.registerUser(userName, password, isAdmin);
            }


        }
    }

}

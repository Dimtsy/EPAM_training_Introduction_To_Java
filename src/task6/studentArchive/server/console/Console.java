package task6.studentArchive.server.console;


import task6.studentArchive.server.authentication.Authenticator;
import task6.studentArchive.server.student.Student;
import task6.studentArchive.server.student.StudentHandler;
import task6.studentArchive.server.user.User;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Console {
    private BufferedReader reader;
    private BufferedWriter writer;
    private StudentHandler studentHandler = StudentHandler.getInstance();
    private static Console instance = new Console();

    public static Console getInstance() {

        return instance;
    }

    public Console() {

    }

    public void startConsole(BufferedReader reader,BufferedWriter writer) throws IOException, XMLStreamException {
        instance.reader = reader;
        instance.writer = writer;

        User user;
        Authenticator authenticator = new Authenticator();

        while (true) {
            String response = sendCommandWithResponse("Введите Войти или Зарегистрироваться");

            switch (response.toUpperCase()) {
                case "Войти":
                    user = authenticator.logIn();
                    break;
                case "Зарегистрироваться":
                    user = authenticator.signUp();
                    break;
                default:
                    sendCommand("Ответ не распознан");
                    return;
            }
            if (user.isAdmin()) {
                adminConsole();
            } else userConsole();
        }

    }

    private void userConsole() throws IOException {

        while (true) {
            String response = sendCommandWithResponse("1 - показать данные всех учеников, 0 - выйти");

            switch (response) {
                case "0":
                    return;
                case "1":
                    studentHandler.showAllStudents();
                    break;
                default:
                    sendCommand("Выберите один из варианто 1 или 0");
            }
        }
    }

    private void adminConsole() throws IOException, XMLStreamException {

        while (true) {
            String response = sendCommandWithResponse("1 — показать всех учеников 2 — найти ученика" +
                    " 3 — добавить нового ученика 4 — изменить данные ученика 0 — выйти");

            String name;
            Student student;
            switch (response) {
                case "0":
                    return;
                case "1":
                    sendCommand(studentHandler.showAllStudents());
                    break;
                case "2":
                    name = sendCommandWithResponse("Введите имя учащегося");
                    student = studentHandler.findStudent(name);

                    if (student != null) {
                        sendCommand("Студент найден:");
                        sendCommand(student.toString());
                    } else sendCommand("Студент не найден");
                    break;
                case "3":
                    name = sendCommandWithResponse("Введите имя учащегося");
                    int averageMark = Integer.parseInt(sendCommandWithResponse("Введите средний бал"));

                    studentHandler.addNewStudent(new Student(name, averageMark));
                    break;
                case "4":
                    String nameStudent = sendCommandWithResponse("Введите имя студента");
                    student = studentHandler.findStudent(nameStudent );
                    if (student != null) {
                        sendCommand("Студент найден:");
                        sendCommand(student.toString());

                        String newName = sendCommandWithResponse("Введите новое имя");
                        int newAvgMark = Integer.parseInt(sendCommandWithResponse("Введите новый средний бал"));

                        student.setName(newName);
                        student.setAverageMark(newAvgMark);

                    } else sendCommand("Студент не найден");
                    studentHandler.writeStudentsData();
                    break;
                default:
                    sendCommand("Выберите верный вариант");
            }
        }
    }

    public String sendCommandWithResponse(String command) throws IOException {
        writer.write(command);
        writer.newLine();
        writer.flush();

        return reader.readLine();
    }

    public void sendCommand(String command) throws IOException {
        writer.append(command).append("/");
    }
    public void pushSendCommand() throws IOException {
        writer.newLine();
        writer.flush();
    }

}

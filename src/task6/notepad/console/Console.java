package task6.notepad.console;

import task6.notepad.action.Action;
import task6.notepad.display.Display;
import task6.notepad.note.Note;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Console {
    private Action action = new Action();
    private Display display = new Display();
    private Scanner scanner = new Scanner(System.in);
    private static final Pattern patternFindMail = Pattern.compile("(\\w{6,})@(\\w+\\.)([a-z]{2,4})");

    public void consoleMenu(){
        while (true) {
            int chose;
            do {
                System.out.println("-----------Вы открыли блокнот---------");
                System.out.println("1 - Смотреть записи\n" +
                        "2 - Добавить новую запись\n" +
                        "3 - Удалить запись\n" +
                        "4 - Найти запись\n" +
                        "выход - закрыть блокнот");

                while (!scanner.hasNextInt()) {
                    if (scanner.next().equals("выход")) {
                        action.writeNotesToFile();
                        System.exit(0);
                    }
                    System.out.println("Выберите цыфру от 1 до 4 или выход");
                }
                chose = scanner.nextInt();
                scanner.nextLine();


            } while (chose < 1 || chose > 4);

            switch (chose) {
                case 1:
                    display.displayNotes(action.getNotes());
                    break;
                case 2:
                    action.addNote(new Note(inputTopic(), inputDate(), inputMsg(), inputEmail()));
                    break;
                case 3:
                    action.removeNote(inputTopic());
                    break;
                case 4:
                    consoleSearch();
                    break;
                default:
                    break;

            }
        }
    }
    private void consoleSearch(){
        int chose;
        do {
            System.out.println("-----------Вы открыли поиск---------");
            System.out.println("1 - Искать по заглавию\n" +
                    "2 - Искать по дате создания\n" +
                    "3 - Искать по сообщению\n" +
                    "4 - Искать по email\n" +
                    "5 - Искать по заглавию и email\n" +
                    "6 - Искать по дате создания и сообщению\n" +
                    "выход - закрыть блокнот");

            while (!scanner.hasNextInt()){
                if(scanner.next().equals("выход")){
                    action.writeNotesToFile();
                    System.exit(0);
                }
                System.out.println("Выберите цыфру от 1 до 6 или выход");
            }
            chose = scanner.nextInt();
            scanner.nextLine();


        }while (chose<1||chose>6);

        switch (chose){
            case 1:
                display.displayNotes(action.findTopic(inputTopic()));
                break;
            case 2:
                display.displayNotes(action.findCreationData(inputDate()));
                break;
            case 3:
                display.displayNotes(action.findMsg(inputMsg()));
                break;
            case 4:
                display.displayNotes(action.findEmail(inputEmail()));
                break;
            case 5:
                display.displayNotes(action.findTopicAndEmail(inputTopic(),inputEmail()));
                break;
            case 6:
                display.displayNotes(action.findMsgAndCreationDate(inputMsg(),inputDate()));
                break;
            default:
                break;

        }

    }
    private String inputTopic(){
        System.out.println("Напишите заголовок");
        return scanner.nextLine();
    }
    private Date inputDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        System.out.println("Напишите дату в формате dd/MM/yyyy");
        while (true) {
            try {
                date = simpleDateFormat.parse(scanner.nextLine());
                return date;
            } catch (ParseException e) {
                System.out.println("Введен не верный формат даты попробуйте еще раз");
            }
        }
    }
    private String inputMsg(){
        System.out.println("Напишите сообщение");
        return scanner.nextLine();
    }
    private String inputEmail(){
        String line;
        while (true) {
            System.out.println("Напишите email");
            line = scanner.nextLine();
            if (patternFindMail.matcher(line).find()) {
                return line;
            }
            System.out.println("email не распознан");
        }

    }

}

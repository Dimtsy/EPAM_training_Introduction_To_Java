package programmingWithClasses.simplestClassesAndObjects;

import java.util.*;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class Train {
    private String destination;
    private int number;
    private GregorianCalendar calendar;

    public Train(String destination, int number, GregorianCalendar calendar) {
        this.destination = destination;
        this.number = number;
        this.calendar = calendar;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public static void main(String[] args) {

        Train[] train = createTrain();

        menu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if (input.equals("а")) {
                sortNumber(train);
            } else if (input.equals("б")) {
                sortDestinationCalendar(train);
            } else {
                numberTrain(train, input);
            }
        }
    }

    public static Train[] createTrain(){
        Train[] train = new Train[5];
        train[0]=new Train("Барановичи",640,
                new GregorianCalendar(2021, Calendar.JANUARY , 25,5,30));
        train[1]=new Train("Гродно",315,
                new GregorianCalendar(2021, Calendar.JANUARY , 25,11,40));
        train[2]=new Train("Брест",617,
                new GregorianCalendar(2021, Calendar.JANUARY , 25,3,20));
        train[3]=new Train("Полоцк",518,
                new GregorianCalendar(2021, Calendar.JANUARY , 25,1,30));
        train[4]=new Train("Барановичи",406,
                new GregorianCalendar(2021, Calendar.JANUARY , 25,4,59));

        return train;
    }
    public static void menu(){
        System.out.println("Введите букву(корил):\na - отсортировать список поездов по номеру поезда." +
                "\nб - отсортировать список поездов по пункту назначения.\n" +
                "Или введите номер поезда для получения более подробной информации о нем. ");
    }
    public static void sortNumber(Train[] train){
        Arrays.sort(train, Comparator.comparing(Train::getNumber));
        for (Train train1 : train) {
            System.out.println("Поезд номер "+train1.getNumber()+" сл. до станции "+train1.getDestination()+
                    " время отправл. "+train1.getCalendar().get(Calendar.HOUR)+":"+train1.getCalendar().get(Calendar.MINUTE));
        }
    }
    public static void sortDestinationCalendar(Train[] train){
        Arrays.sort(train, Comparator.comparing(Train::getDestination).thenComparing(Train::getCalendar));
        for (Train train1 : train) {
            System.out.println(" сл. до станции "+train1.getDestination()+
                    " время отправл. "+train1.getCalendar().get(Calendar.HOUR)+":"+train1.getCalendar().get(Calendar.MINUTE)+"Поезд номер "+train1.getNumber());
        }
    }
    public static void numberTrain(Train[] train,String input){
        if (new Scanner(input).hasNextInt()) {
            for (Train t:train) {
                if (t.getNumber() == Integer.parseInt(input)) {
                    System.out.println(" Поезд номер "+t.getNumber()+" сл. до станции "+t.getDestination()+
                            " время отправл. "+t.getCalendar().get(Calendar.HOUR)+":"+t.getCalendar().get(Calendar.MINUTE));
                }
            }
        }
    }

}

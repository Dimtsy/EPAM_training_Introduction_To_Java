package basicsOfOOP.calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Calendar.Holiday holiday = calendar.new Holiday("Хэлоун",11,11);
        calendar.addHolidays(holiday);
        calendar.addHolidays(calendar.new Holiday("Рождество",7,1));
        calendar.print();
        calendar.removeHolidays("Хэлоун");
        calendar.print();
    }
}

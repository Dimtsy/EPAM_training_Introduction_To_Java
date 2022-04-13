package basicsOfOOP.calendar;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Holiday> holidays = new ArrayList<>();

    public void addHolidays(Holiday holiday) {
        holidays.add(holiday);
    }

    public void removeHolidays(String name) {
        holidays.removeIf(p -> p.getName().equals(name));
    }

    public void print() {
        holidays.forEach(System.out::println);
    }

    class Holiday {
        private String name;
        private int month;
        private int day;

        public Holiday(String name, int month, int day) {
            if (day > 31 || day <= 0 || month <= 0 || month > 12 || name == null) {
                System.out.println("Число или месяц не соответствуе календарному дню");
            } else {
                this.name = name;
                this.month = month;
                this.day = day;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "name='" + name + '\'' +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "Calendar{" +
                "holidays=" + holidays +
                '}';
    }
}

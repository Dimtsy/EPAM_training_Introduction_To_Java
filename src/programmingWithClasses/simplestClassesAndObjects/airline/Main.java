package programmingWithClasses.simplestClassesAndObjects.airline;

public class Main {
    public static void main(String[] args) {
        Airline[] airline = new Airline[]{new Airline("USA",123,"Hard",
                "13:15",DayWeek.FRIDAY),
                new Airline("UK",457,"Hard",
                "15:15",DayWeek.FRIDAY),
                new Airline("LA",890,"Hard",
                        "13:30",DayWeek.MONDAY)
        };

        AggregateArrayAirline aggregateArrayAirline = new AggregateArrayAirline(airline);
        aggregateArrayAirline.listFlightsDayWeekTime(DayWeek.FRIDAY,"13:00");
        System.out.println();
        aggregateArrayAirline.listFlightsDayWeek(DayWeek.SUNDAY);
        System.out.println();
        aggregateArrayAirline.listDestination("UK");

    }
}

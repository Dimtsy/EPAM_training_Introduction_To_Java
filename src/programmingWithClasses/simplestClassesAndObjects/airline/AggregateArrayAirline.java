package programmingWithClasses.simplestClassesAndObjects.airline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AggregateArrayAirline {
    private Airline[] airlines;

    public AggregateArrayAirline(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void listDestination(String destination){
        for (Airline a:airlines) {
            if(a.getDestination().equals(destination)){
                System.out.println(a);
            }
        }
    }
    public void listFlightsDayWeek(DayWeek dayWeek){
        for (Airline a:airlines) {
            if(a.getDaysWeek().equals(dayWeek)){
                System.out.println(a);
            }
        }
    }
    public void listFlightsDayWeekTime(DayWeek dayWeek,String time){

        for (Airline a:airlines) {
            if(a.getDaysWeek().equals(dayWeek)){

            Pattern pattern = Pattern.compile("(\\d+):(\\d+)");

            Matcher matcher = pattern.matcher(time);
            Matcher matcher1 = pattern.matcher(a.getDepartureTime());

            while (matcher1.find()&&matcher.find()) {
                if (Integer.parseInt(matcher1.group(1)) > Integer.parseInt(matcher.group(1))) {
                    System.out.println(a);
                }else if (Integer.parseInt(matcher1.group(1)) == Integer.parseInt(matcher.group(1))){
                    if (Integer.parseInt(matcher1.group(2)) >= Integer.parseInt(matcher.group(2))){
                        System.out.println(a);
                    }
                }
            }

            }
        }

    }

}

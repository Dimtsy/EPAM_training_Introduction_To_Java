package programmingWithClasses.simplestClassesAndObjects.airline;

import java.util.GregorianCalendar;

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private DayWeek daysWeek;

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, DayWeek daysWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysWeek = daysWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public DayWeek getDaysWeek() {
        return daysWeek;
    }

    public void setDaysWeek(DayWeek daysWeek) {
        this.daysWeek = daysWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", daysWeek=" + daysWeek +
                '}';
    }
}

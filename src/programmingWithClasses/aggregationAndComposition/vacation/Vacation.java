package programmingWithClasses.aggregationAndComposition.vacation;

public class Vacation {
    private String country;
    private VacationType vacationType;
    private Transport transport;
    private int numberDay;
    private boolean food;

    public Vacation(String country, VacationType vacationType, Transport transport, int numberDay, boolean food) {
        this.country = country;
        this.vacationType = vacationType;
        this.transport = transport;
        this.numberDay = numberDay;
        this.food = food;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public VacationType getVacationType() {
        return vacationType;
    }

    public void setVacationType(VacationType vacationType) {
        this.vacationType = vacationType;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "country='" + country + '\'' +
                ", vacationType=" + vacationType +
                ", transport=" + transport +
                ", numberDay=" + numberDay +
                ", food=" + food +
                '}';
    }
}

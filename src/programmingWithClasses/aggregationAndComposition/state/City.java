package programmingWithClasses.aggregationAndComposition.state;

public class City {
    private String nameCity;
    private int people;

    public City(String nameCity, int people) {
        this.nameCity = nameCity;
        this.people = people;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                ", people=" + people +
                '}';
    }
}

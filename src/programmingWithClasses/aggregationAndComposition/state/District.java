package programmingWithClasses.aggregationAndComposition.state;

import java.util.ArrayList;

public class District {
    private String nameDistrict;
    private ArrayList<City> cityArrayList=new ArrayList<>();

    public District(String nameDistrict, ArrayList<City> cityArrayList) {
        this.nameDistrict = nameDistrict;
        this.cityArrayList = cityArrayList;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    public void setCityArrayList(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    @Override
    public String toString() {
        return "District{" +
                "nameDistrict='" + nameDistrict + '\'' +
                ", cityArrayList=" + cityArrayList +
                '}';
    }
}

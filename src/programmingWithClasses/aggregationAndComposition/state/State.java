package programmingWithClasses.aggregationAndComposition.state;

import java.util.Arrays;

public class State {
    private String nameState;
    private String capital;
    private double area;
    private Region[] region;

    public State(String nameState, String capital, double area, Region[] region) {
        this.nameState = nameState;
        this.capital = capital;
        this.area = area;
        this.region = region;
    }

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Region[] getRegion() {
        return region;
    }

    public void setRegion(Region[] region) {
        this.region = region;
    }


    public void printCapital(){
        System.out.println(capital);
    }
    public void printRegion(){
        System.out.println(region.length);
    }
    public void printArea(){
        System.out.println(area);
    }
    public void printNameRegion(){
        for (Region r:region) {
            System.out.println(r.getRegionCentre());
        }

    }
    public void printNameDistrict(){
        for (Region r:region) {
            r.getDistrictArrayList().forEach(c-> System.out.println(c.getNameDistrict()));
        }

    }
    public void printNameCity(){
        for (Region r:region) {
            r.getDistrictArrayList().forEach(c-> c.getCityArrayList().forEach(p-> System.out.println(p.getNameCity())));
        }

    }
}

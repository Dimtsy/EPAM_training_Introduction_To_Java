package programmingWithClasses.aggregationAndComposition.state;

import java.util.ArrayList;

public class Region {
    private String nameRegion;
    private String regionCentre;
    private ArrayList<District> districtArrayList = new ArrayList<>();

    public Region(String nameRegion, String regionCentre, ArrayList<District> districtArrayList) {
        this.nameRegion = nameRegion;
        this.regionCentre = regionCentre;
        this.districtArrayList = districtArrayList;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public String getRegionCentre() {
        return regionCentre;
    }

    public void setRegionCentre(String regionCentre) {
        this.regionCentre = regionCentre;
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }
}

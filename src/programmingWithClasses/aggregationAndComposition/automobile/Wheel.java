package programmingWithClasses.aggregationAndComposition.automobile;

public class Wheel {
private int diameter;
private String modelWheel;

    public Wheel(int diameter, String modelWheel) {
        this.diameter = diameter;
        this.modelWheel = modelWheel;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getModelWheel() {
        return modelWheel;
    }

    public void setModelWheel(String modelWheel) {
        this.modelWheel = modelWheel;
    }
}

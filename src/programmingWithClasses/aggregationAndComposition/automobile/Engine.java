package programmingWithClasses.aggregationAndComposition.automobile;

public class Engine {
    private double engineVolume;
    private String engineModel;

    public Engine(double engineVolume, String engineModel) {
        this.engineVolume = engineVolume;
        this.engineModel = engineModel;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}

package programmingWithClasses.aggregationAndComposition.automobile;

public class Automobile {
private String carModel;
private int volumeTank;
private int amountGasoline;
private Engine typeEngine;
private Wheel typeWheel;

    public Automobile(String carModel, int volumeTank, int amountGasoline, Engine typeEngine, Wheel typeWheel) {

        this.carModel = carModel;
        this.volumeTank = volumeTank;
        if(amountGasoline>volumeTank){
            this.amountGasoline = volumeTank;
        }else {
            this.amountGasoline = amountGasoline;
        }
        this.typeEngine = typeEngine;
        this.typeWheel = typeWheel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(int volumeTank) {
        this.volumeTank = volumeTank;
    }

    public int getAmountGasoline() {
        return amountGasoline;
    }


    public Engine getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(Engine typeEngine) {
        this.typeEngine = typeEngine;
    }

    public Wheel getTypeWheel() {
        return typeWheel;
    }


    public void drive(){
        System.out.println("На автомобиле "+carModel+" Вы смогли проехать "+100*amountGasoline/(5*typeEngine.getEngineVolume())+" км " +
                " и ваш бензин закончился, нужна дозаправка");
        amountGasoline=0;
    }
    public void setAmountGasoline(int amountGasoline) {
        if(amountGasoline>volumeTank){
            this.amountGasoline = volumeTank;
        }else {
            this.amountGasoline = amountGasoline;
        }
        System.out.println("Была произведена дозаправка на "+amountGasoline+" литров");
    }
    public void setTypeWheel(Wheel typeWheel) {
        this.typeWheel = typeWheel;
        System.out.println("Замена колёс на "+typeWheel.getModelWheel());
    }

}

package programmingWithClasses.aggregationAndComposition.state;

import java.util.ArrayList;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Main {
    public static void main(String[] args) {
        ArrayList<City> cityBobruisk = new ArrayList<>();
        cityBobruisk.add(new City("город Василевичи",10000));

        ArrayList<District> districtMogilev = new ArrayList<>();
        districtMogilev.add(new District("Бобруйский район",cityBobruisk));

        State state = new State("Belarus","Minsk",20.7,new Region[]{
                new Region("Могилевская обл.","Могилев",districtMogilev)
        });

        System.out.println("Столица");
        state.printCapital();
        System.out.println("Количество облостей:");
        state.printRegion();
        System.out.println("Площадь млн/га:");
        state.printArea();
        System.out.println("Облостные центры:");
        state.printNameRegion();


    }
}

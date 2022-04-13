package programmingWithClasses.aggregationAndComposition.automobile;
//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args) {
        Automobile automobile = new Automobile("БМВ",100,50,
                new Engine(2.5,"Volkswagen"),
                new Wheel(18,"ABS"));
        automobile.drive();
        automobile.setAmountGasoline(80);
        automobile.drive();
        automobile.setTypeWheel(new Wheel(18,"AMB"));
    }
}

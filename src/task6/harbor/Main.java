package task6.harbor;
//Задание 4. Многопоточность. Порт . Корабли заходят в порт для
//разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
//в порту и на корабле, должно быть неотрицательным и превышающим заданную
//грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
//У одного причала может стоять один корабль. Корабль может загружаться у причала
//или разгружаться.
public class Main {
    public static void main(String[] args) {
        Harbor harbor = new Harbor(10000, 7
        );

        Ship ship1 = new Ship(2000, "ship1", 900);
        Ship ship2 = new Ship(4000, "ship2", 3000);
        Ship ship3 = new Ship(5000, "ship3", 400);
        Ship ship4 = new Ship(4000, "ship4", 3500);
        Ship ship5 = new Ship(3000, "ship5", 2500);
        Ship ship6 = new Ship(2000, "ship6", 900);
        Ship ship7 = new Ship(9000, "ship7", 900);

        harbor.addShipForLoading(ship1, 300);
        harbor.addShipForLoading(ship2, 900);
        harbor.addShipForLoading(ship3, 2000);
        harbor.addShipForLoading(ship4, 700);
        harbor.addShipForUnloading(ship5, 2000);
        harbor.addShipForUnloading(ship6, 600);
        harbor.addShipForUnloading(ship7, 7000);
    }
}

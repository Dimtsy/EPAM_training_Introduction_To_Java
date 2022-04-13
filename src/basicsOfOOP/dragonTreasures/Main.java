package basicsOfOOP.dragonTreasures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DragonCave dragonCave = new DragonCave(100);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите букву(лат.):\na - просмотр всех сокровищ;" +
                    "\nb - выбрать самое дорого сокровище;" +
                    "\nc - выбор сокровища на заданную сумму.");
            switch (scanner.next()) {
                case "a":
                    dragonCave.print();
                    break;
                case "b":
                    dragonCave.maxTreasure();
                    break;
                case "c":
                    System.out.println("Введите сумму:");
                    String ch = scanner.next();
                    dragonCave.collectPrice(Integer.parseInt(ch));
                    break;
            }
        }

    }
}

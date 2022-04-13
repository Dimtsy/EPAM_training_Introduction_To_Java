package basicsOfOOP.bouquetFlowers;

import basicsOfOOP.bouquetFlowers.flowers.Colors;
import basicsOfOOP.bouquetFlowers.flowers.FlowersCreate;
import basicsOfOOP.bouquetFlowers.flowers.FlowersType;
import basicsOfOOP.bouquetFlowers.packageFlowers.PackageCreate;
import basicsOfOOP.bouquetFlowers.packageFlowers.PackageType;

public class Main {
    public static void main(String[] args) {

        BouquetFlowers bouquetFlowers = new BouquetFlowers();

        FlowersCreate flowersCreate = new FlowersCreate();

        bouquetFlowers.addFlowers(flowersCreate.createFlowers(FlowersType.CHAMOMILE, Colors.BLUE, 3));
        bouquetFlowers.addFlowers(flowersCreate.createFlowers(FlowersType.CARNATIONS, Colors.RED, 2));
        bouquetFlowers.addFlowers(flowersCreate.createFlowers(FlowersType.ROSES, Colors.WHITE, 7));
        bouquetFlowers.addFlowers(flowersCreate.createFlowers(FlowersType.PEONIES, Colors.YELLOW, 4));

        PackageCreate packageCreate = new PackageCreate();
        bouquetFlowers.setPackageFlowers(packageCreate.createPackage(PackageType.PAPER, "Синий", "Праздничный"));

        System.out.println(bouquetFlowers);
    }
}

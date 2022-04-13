package basicsOfOOP.bouquetFlowers;

import basicsOfOOP.bouquetFlowers.flowers.Flowers;
import basicsOfOOP.bouquetFlowers.packageFlowers.PackageFlowers;

import java.util.ArrayList;

public class BouquetFlowers {
    private ArrayList<Flowers> flowers = new ArrayList<>();
    private PackageFlowers packageFlowers;

    public void addFlowers(Flowers flowers) {
        this.flowers.add(flowers);
    }

    public ArrayList<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flowers> flowers) {
        this.flowers = flowers;
    }

    public PackageFlowers getPackageFlowers() {
        return packageFlowers;
    }

    public void setPackageFlowers(PackageFlowers packageFlowers) {
        this.packageFlowers = packageFlowers;
    }

    @Override
    public String toString() {
        return "BouquetFlowers{" +
                "flowers=" + flowers +
                ", packageFlowers=" + packageFlowers +
                '}';
    }
}

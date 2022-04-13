package basicsOfOOP.bouquetFlowers.packageFlowers;

import basicsOfOOP.bouquetFlowers.flowers.*;

public class PackageCreate {
    public PackageFlowers createPackage(PackageType packageType,String color, String drawing){
        switch (packageType){
            case CELLOPHANE:return new Cellophane(color,drawing);
            case MESH:return new Mesh(color,drawing);
            case PAPER:return new Paper(color,drawing);
            default:
                System.out.println("Ошибка");
                return null;
        }
    }
}

package basicsOfOOP.bouquetFlowers.packageFlowers;

public class Mesh implements PackageFlowers{
    private String colorPackage;
    private String drawing;

    public Mesh(String colorPackage, String drawing) {
        this.colorPackage = colorPackage;
        this.drawing = drawing;
    }

    @Override
    public void setColorPackage(String colorPackage) {
        this.colorPackage = colorPackage;
    }

    @Override
    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    @Override
    public String toString() {
        return "Mesh{" +
                "colorPackage='" + colorPackage + '\'' +
                ", drawing='" + drawing + '\'' +
                '}';
    }
}

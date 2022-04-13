package basicsOfOOP.bouquetFlowers.flowers;

public class Tulips implements Flowers{
    private Colors color;
    private int number;

    public Tulips(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    @Override
    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}

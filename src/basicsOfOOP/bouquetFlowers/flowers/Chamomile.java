package basicsOfOOP.bouquetFlowers.flowers;

public class Chamomile implements Flowers{
    private Colors color;
    private int number;

    public Chamomile(Colors color, int number) {
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
        return "Chamomile{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}

package basicsOfOOP.dragonTreasures.treasures;

import java.util.Random;

public class Treasures {
    private TreasureName treasureName;
    private TreasureType treasureType;
    private int price;

    public Treasures() {
        Random random = new Random();
        TreasureName[] treasureNames = TreasureName.values();
        treasureName = treasureNames[random.nextInt(treasureNames.length)];
        TreasureType[] treasureTypes = TreasureType.values();
        treasureType = treasureTypes[random.nextInt(treasureTypes.length)];
        price = random.nextInt(99)+1;
    }

    public TreasureName getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(TreasureName treasureName) {
        this.treasureName = treasureName;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(TreasureType treasureType) {
        this.treasureType = treasureType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasures{" +
                "treasureName=" + treasureName +
                ", treasureType=" + treasureType +
                ", price=" + price +
                '}';
    }
}

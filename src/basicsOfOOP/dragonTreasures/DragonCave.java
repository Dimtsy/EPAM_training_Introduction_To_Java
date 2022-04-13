package basicsOfOOP.dragonTreasures;

import basicsOfOOP.dragonTreasures.treasures.Treasures;

import java.util.ArrayList;
import java.util.Comparator;

public class DragonCave {
    private ArrayList<Treasures> treasures = new ArrayList<>();
    private int count;

    public DragonCave(int count) {
        if(count>=0){
            for (int i = 0; i <count ; i++) {
                treasures.add(new Treasures());
            }
        }
    }
    public void print(){
        treasures.forEach(p-> System.out.println(p.getTreasureName()+" "+p.getTreasureType()+" "+p.getPrice()));
    }

    public void maxTreasure(){
        Treasures treasures1 = treasures.stream().max(Comparator.comparing(Treasures::getPrice)).get();
        System.out.println("Самое дорогое сокровище "+treasures1.getTreasureName()+" "+treasures1.getTreasureType()+" "+treasures1.getPrice());
    }
    public void collectPrice(int price){
        int sum=0;
        for (Treasures t:treasures) {
            if((sum+=t.getPrice())>price){
                sum-=t.getPrice();
            }else {
                System.out.println(t.getTreasureName()+" "+t.getTreasureType()+" "+t.getPrice());
            }
        }

    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "treasures=" + treasures +
                ", count=" + count +
                '}';
    }
}

package basicsOfOOP.bouquetFlowers.flowers;

public class FlowersCreate {
    public Flowers createFlowers(FlowersType flowersType,Colors color, int number){
        switch (flowersType){
            case ROSES:return new Roses(color,number);
            case CARNATIONS:return new Carnations(color,number);
            case CHAMOMILE:return new Chamomile(color,number);
            case PEONIES:return new Peonies(color,number);
            case TULIPS:return new Tulips(color,number);
            default:
                System.out.println("Ошибка");
                return null;
        }
    }
}

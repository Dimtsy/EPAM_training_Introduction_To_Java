package task6.harbor;

public class Harbor {
    private int capacity;
    private int berthCount;
    private static volatile int shipsInHarbor;
    private static volatile int containersInHarbor;

    public Harbor(int capacity, int berthCount) {
        if (capacity <= 0 || berthCount <= 0) {
            throw new IllegalArgumentException("Вместимость порта или количество причалов" +
                    " не может быть меньше или равно 0");
        }

        this.capacity = capacity;
        this.berthCount = berthCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBerthCount() {
        return berthCount;
    }

    public void setBerthCount(int berthCount) {
        this.berthCount = berthCount;
    }
    //погрузка на карабль с причала
    public void addShipForLoading(Ship ship, int containersNum) {

        Thread thread = new Thread(() -> {
            while (getBerth(ship,containersNum,true)) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ship.loadContainers(containersNum);
            freeBerth();
        });
        thread.start();
    }

    //разгрузка с карабля на причал
    public void addShipForUnloading(Ship ship, int containersNum) {
        Thread thread = new Thread(() -> {
            while (getBerth(ship,containersNum,false)) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ship.unloadContainers(containersNum);
            setContainers(containersNum);
            freeBerth();
        });
        thread.start();
    }

    private synchronized boolean getBerth(Ship ship, int containersNum,boolean loudUnLoud) {
        if(loudUnLoud){
            return getBerthLoud(ship,containersNum);
        }else {
            return getBerthUnLoud(ship,containersNum);
        }
    }

    private  boolean getBerthLoud(Ship ship, int containersNum){
        if(containersInHarbor - containersNum < 0||shipsInHarbor + 1 > berthCount){
            if(shipsInHarbor + 1 > berthCount){
                System.out.printf("(%s) - Все причалы заняты. Текущая загрузка причалов %d из %d. Ждем 10 секунд...\n",
                        ship.getName(),shipsInHarbor,berthCount);
            }else {
                System.out.printf("(%s) - В порту не хватает контейнеров для необходимой загрузки. " +
                                "Груза в порту = %d. Ждем 10 сек... \n", ship.getName(),containersInHarbor);
            }
            return true;
        }else {
            getShipInHarbor();
            getContainers(containersNum);
            System.out.printf("(%s) - Корабль подошел к причалу для загрузки. Текущая загрузка причалов %d из %d." +
                    " Груза в порту = %d.\n", ship.getName(),shipsInHarbor,berthCount,containersInHarbor);
            return false;
        }
    }

    private boolean getBerthUnLoud(Ship ship, int containersNum){
        if(shipsInHarbor + 1 > berthCount){
            System.out.printf("(%s) - Все причалы заняты. Текущая загрузка причалов %d из %d. Груза в порту = %d." +
                            " Ждем 10 сек...\n", ship.getName(),shipsInHarbor,berthCount,containersInHarbor);
            return true;
        }else {
            getShipInHarbor();
            if (containersInHarbor + containersNum > capacity){
                System.out.printf("(%s) - В порту не хватает места для выгрузки, но груз всеравно будет выгружен с " +
                        "переполнением на %d.\n",ship.getName(), ((containersInHarbor + containersNum)-capacity));
            }
            System.out.printf("(%s) - Корабль подошел к причалу для выгрузки. Текущая загрузка портов %d из %d. " +
                            "Груза в порту  = %d\n", ship.getName(),shipsInHarbor,berthCount,containersInHarbor);
            return false;
        }
    }

    private synchronized void getShipInHarbor() {
        shipsInHarbor++;
    }
    private synchronized void freeBerth() {
        shipsInHarbor--;
    }
    private synchronized void getContainers(int containersNum) {
        containersInHarbor -= containersNum;
    }
    private synchronized void setContainers(int containersNum) {
        containersInHarbor += containersNum;

    }
}

package task6.harbor;

public class Ship {
    private int capacity;
    private String name;
    private int numOfContainers;

    public Ship(int capacity, String name, int numOfContainers) {
        if (capacity <= 0 || numOfContainers < 0) {
            throw new IllegalArgumentException("Емкость корабля не может быть меньше или равна 0 " +
                    "и количество контейнеров не может быть меньше 0");
        }

        if (numOfContainers > capacity) {
            throw new IllegalArgumentException("Корабль не может вместить столько контейнеров. Максимальная " +
                    "вместительность корабля " + capacity);
        }

        this.capacity = capacity;
        this.name = name;
        this.numOfContainers = numOfContainers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfContainers() {
        return numOfContainers;
    }

    public void setNumOfContainers(int numOfContainers) {
        this.numOfContainers = numOfContainers;
    }

    public void loadContainers(int numOfContainers) {

        if (this.numOfContainers + numOfContainers > capacity) {
            System.out.printf("(%s) - Невозможно загрузить столько контейнеров," +
                    " доступно максимальное количество свободных мест:" +
                    " %s но вы хотите загрузить %s, контейнеры всеравно загрузятся с перегрузом в %s. " +
                            "Начало загрузки..." +
                    " \n", getName(), (capacity - this.numOfContainers),numOfContainers,
                    numOfContainers-(capacity - this.numOfContainers));
            timeLoad(numOfContainers);
            this.numOfContainers += numOfContainers;
            System.out.printf("(%s) - Загрузка завершена, перегруз на борту %d \n", getName(),
                    (this.numOfContainers-capacity));
        } else {
            System.out.printf("(%s) - Начало загрузки. Время загрузки %s сек.\n", this.name,numOfContainers * 10/1000);
            timeLoad(numOfContainers);
            this.numOfContainers += numOfContainers;
            System.out.printf("(%s) - Загрузка завершена, свободных мест на борту %d \n", getName(),
                    (capacity - this.numOfContainers));
        }
    }

    public void timeLoad(int numOfContainers){
        try {

            Thread.sleep(numOfContainers * 10);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void unloadContainers(int numOfContainers) {
        System.out.printf("(%s) - Начинается выгрузка, время ожидания %s сек.\n", this.name,this.numOfContainers * 2/1000);
        if (numOfContainers > this.numOfContainers) {

            try {

                Thread.sleep(this.numOfContainers * 2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.numOfContainers = 0;

        } else {
            try {

                Thread.sleep(numOfContainers * 2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.numOfContainers -= numOfContainers;
        }
        System.out.printf("(%s) - Выгрузка завершена\n", this.name);
    }
}

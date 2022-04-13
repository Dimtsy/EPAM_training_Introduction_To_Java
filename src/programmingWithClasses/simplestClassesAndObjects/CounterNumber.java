package programmingWithClasses.simplestClassesAndObjects;

public class CounterNumber {
    private int counter;
    private int maxValue;
    private int start;

    public static void main(String[] args) {
        CounterNumber a = new CounterNumber(5, 10, 6);
        CounterNumber b = new CounterNumber(6, 4, 7);
        CounterNumber c = new CounterNumber(5, 3);
        System.out.println("a: " + a.getCounter());
        System.out.println("b: " + b.getCounter());
        System.out.println("c: " + c.getCounter());
        System.out.println("----------------------");
        for (int i = 0; i < 2; ++i) {
            a.inc();
            b.inc();
            c.inc();
        }
        System.out.println("a: " + a.getCounter());
        System.out.println("b: " + b.getCounter());
        System.out.println("c: " + c.getCounter());
        System.out.println("----------------------");
        for (int i = 0; i < 20; ++i) {
            a.dec();
            b.dec();
            c.dec();
        }
        System.out.println("a: " + a.getCounter());
        System.out.println("b: " + b.getCounter());
        System.out.println("c: " + c.getCounter());
        System.out.println("----------------------");
    }


    public CounterNumber(int start1, int maxValue1, int counter1) {
        counter=counter1;
        maxValue=maxValue1;
        start=start1;
        if (start > maxValue) {
            int tmp =maxValue;
            maxValue = start;
            start = tmp;

        }

        if (counter < start) {
            counter=start;
        }
        if (counter > maxValue) {
            counter=maxValue;
        }
    }

    public CounterNumber(int start1, int maxValue1) {
        this(start1,maxValue1,start1);
        counter=start;
    }

    public CounterNumber() {
        this(0,18,0);
    }

    public void inc() {
        counter++;
        if (counter > maxValue) {
            counter = start;
        }
    }

    public void dec() {
        counter--;
        if (counter < start) {
            counter=maxValue;
        }
    }

    public int getCounter() {
        return counter;
    }
}

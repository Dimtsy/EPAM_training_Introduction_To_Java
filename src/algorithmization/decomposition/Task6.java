package algorithmization.decomposition;

import algorithmization.CreatingArrays;

public class Task6 {
    public static void task6() {
        System.out.println("6. Написать метод(методы), проверяющий, являются ли данные три числа " +
                "взаимно простыми");

        int[]a=new int[3];
        CreatingArrays.oneDimensionalNaturalArrays(a);
        int b=a[0];
        for (int i=1;i<a.length;i++){
            b=algorithmEvklid(b,a[i]);
        }
        System.out.println("НОД = "+b);//Взаимно простые числа — целые числа,
        // не имеющие никаких общих делителей, кроме ±1.
        if (b==1) {
            System.out.println("Данные числа взаимно простые");
        }else {
            System.out.println("Данные числа не взаимно простые");
        }

    }

    public static int algorithmEvklid(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }

}

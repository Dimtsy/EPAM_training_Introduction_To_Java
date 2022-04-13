package algorithmization.decomposition;

import java.util.Random;

public class Task1 {
    public static void task1() {
        System.out.println("1. Написать метод(методы) для нахождения наибольшего общего делителя" +
                " и наименьшего общего кратного двух натуральных чисел:");

        Random random = new Random();
        int a=random.nextInt(20)+1;//0 не является натуральным числом
        int b=random.nextInt(20)+1;
        System.out.println("Первое число: "+a+"\nВторое число:"+b);
        System.out.println("Нахождение НОД по алгоритму Евклида.");
        int d = algorithmEvklid(a,b);


        System.out.println("НОД = "+d);
        int c=a*b/d;
        System.out.println("НОК = "+c);
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

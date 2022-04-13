package algorithmization.decomposition;

import algorithmization.CreatingArrays;

import java.util.Random;

public class Task2 {
    public static void task2() {
        System.out.println("2. Написать метод(методы) для нахождения наибольшего общего делителя" +
                " четырех натуральных чисел.");

        int[]a=new int[4];
//        CreatingArrays.oneDimensionalNaturalArrays(a);
        int b=a[0];
        Random random=new Random();
        System.out.print("Дано:");
        for (int i=0;i<a.length;i++){
            a[i]=random.nextInt(20)+1;
            System.out.print(" "+a[i]);

        }
        for (int i=1;i<a.length;i++){
            b=gcdAlgorithmModulo(a[i],b);
        }
        System.out.println("\nНахождение НОД по алгоритму Евклида.");
        System.out.println("НОД = "+b);
    }
    public static int gcdAlgorithmModulo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

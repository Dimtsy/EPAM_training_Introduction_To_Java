package algorithmization.oneDimensionalArraysSorting;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task3 {
    public static void task3() {
        System.out.println("3. Сортировка выбором. Дана последовательность чисел." +
                "Требуется переставить элементы так, чтобы они были расположены по убыванию." +
                " Для этого в массиве, начиная с первого, выбирается наибольший элемент и " +
                "ставится на первое место, а первый - на место н");

        int[] a = {1, 2, 2, 3, 7, 8, 9, 9,13};
        PrintArrays.printOneDimensionalArrays(a);
        int t;
        for (int i = 0; i < a.length; i++){
            int b=a[i];
            int n = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] > b) {
                    b = a[j];
                    n = j;
                }
            }
             t = a[i];
             a[i] = a[n];
             a[n] = t;
        }

        PrintArrays.printOneDimensionalArrays(a);
    }
}

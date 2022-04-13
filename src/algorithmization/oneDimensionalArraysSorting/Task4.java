package algorithmization.oneDimensionalArraysSorting;

import algorithmization.PrintArrays;

public class Task4 {
    public static void task4() {
        System.out.println("4. Сортировка обменами. Дана последовательность чисел." +
                "Требуется переставить числа в порядке возрастания." +
                " Для этого сравниваются два соседних числа. Если ai > ai+1," +
                " то делается перестановка. Так продолжается до тех пор," +
                " пока все элементы не станут расположены в порядке возрастания." +
                "Составить алгоритм сортировки, подсчитывая при этом количества перестановок.");

        int[] a = {9, 2, 5, 3, 7, 4, 9, 1,13};
        PrintArrays.printOneDimensionalArrays(a);
        int b;
        int n=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                    n++;
                }
            }
        }
        PrintArrays.printOneDimensionalArrays(a);
        System.out.println("Количество перестановок = "+n);
    }
}

package algorithmization.oneDimensionalArraysSorting;

import algorithmization.PrintArrays;

import java.util.Arrays;

public class Task5 {
    public static void task5() {
        System.out.println("5. Сортировка вставками. Требуется переставить числа в порядке возрастания." +
                "Место помещения очередного элемента в отсортированную часть производить" +
                "с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции. ");
        int[] a = { 10,46,1,13,8,6,6,100};
        PrintArrays.printOneDimensionalArrays(a);

        sort(a);

        PrintArrays.printOneDimensionalArrays(a);
    }
    public static void sort(int array[]) {

        for (int i = 1; i < array.length; i++) {

            int x = array[i];

            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
//            в массиве array(1) в диопозоне от 0(2) до i(3) ищет индекс значение x(4), если его нет, то
//            выдает индекс ближайшего по значению этого числа. +1 дает индекс следующий за числом, Math.abs берет по модулю.

            System.arraycopy(array, j, array, j + 1, i - j);
//из массива array(1) копируем кусок начиная с j+1(4) в количестве i-j(5) шт. массива
// и всиавляем этот кусок в массив array(3) начиная с j(2)
            array[j] = x;
        }
    }
}

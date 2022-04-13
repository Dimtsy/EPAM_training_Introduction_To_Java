package algorithmization.oneDimensionalArraysSorting;

import algorithmization.PrintArrays;

import java.util.Arrays;

public class Task7 {
    public static void task7() {
        System.out.println("7. Пусть даны две неубывающие последовательности действительных чисел." +
                "Требуется указать те места, на которые нужно вставлять элементы последовательностив первую" +
                "последовательность так, чтобы новая последовательность оставалась возрастающей.");
        int []a= {1,5,6,8,9};
        int []b={1,5,8,11,55,66};
        System.out.println("Последовательность a:");
        PrintArrays.printOneDimensionalArrays(a);
        System.out.println("Последовательность b:");
        PrintArrays.printOneDimensionalArrays(b);
        int []c=new int[a.length+ b.length];


        System.arraycopy(a, 0,c, 0, a.length);
        int k = a.length;
        System.out.print("Куда нужно вставлять, с учетом вставки слева направо \n[");
        for (int i = 0; i < b.length; i++) {

            int x = b[i];

            int j = Math.abs(Arrays.binarySearch(c, 0, k, x)+1);
            System.arraycopy(c, j,c, j + 1, k - j);


            c[j] = x;
            System.out.print(" "+j);
            k++;
        }
        System.out.println("]");
        System.out.println("Результирующая последовалельность:");
        PrintArrays.printOneDimensionalArrays(c);
    }
}

package algorithmization.oneDimensionalArrays;

import algorithmization.PrintArrays;

import java.util.Random;

public class Task5 {
    public static void task5() {
        System.out.println("5. Даны целые числа а1 ,а2 ,..., аn . " +
                "Вывести на печать только те числа, для которых аi > i.");

        int[] a = new int[5];

        Random random = new Random();
        for (int i=0;i<a.length;i++){
            a[i]= random.nextInt(21)-10;
        }
        PrintArrays.printOneDimensionalArrays(a);
        for (int i=0;i<a.length;i++){
            if(a[i]>i){
                System.out.println("Число "+a[i]);
            }
        }
    }
}

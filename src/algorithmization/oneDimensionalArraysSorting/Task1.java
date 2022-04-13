package algorithmization.oneDimensionalArraysSorting;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task1 {
    public static void task1() {
        System.out.println("1. Заданы два одномерных массива с различным количеством элементов" +
                " и натуральное число k. Объединить их водин массив, включив второй массив" +
                " между k-м и (k+1) - м элементами первого, при этом не используя " +
                "дополнительный массив.");

        int k=2;
        int[]a=new int[5];
        int[]b=new int[6];
        int[]c=new int[a.length+b.length];

        CreatingArrays.oneDimensionalNaturalArrays(a);
        CreatingArrays.oneDimensionalNaturalArrays(b);

        for (int i=0;i<a.length;i++){
            if (i==k+1){
                for (int j=0;j<b.length;j++) {
                    c[k + j] = b[j];
                }
            }
            if(i<k){
                c[i]=a[i];
            }
            if(i>=k){
                c[i+b.length]=a[i];
            }
        }
        PrintArrays.printOneDimensionalArrays(c);
    }
}

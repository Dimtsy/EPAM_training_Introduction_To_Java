package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task8 {
    public static void task8() {
        System.out.println("8. Дана последовательность целых чисел a1, a2, ..., аn. " +
                "\nОбразовать новую последовательность, выбросив из исходной те члены," +
                " которые равны  min(a1, a2, ..., аn).");
        int [] a = new int[10];
        CreatingArrays.oneDimensionalNaturalArrays(a);
        int min=a[0];
        int arrSize=0;
        for (int i=0;i< a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        for (int value:a){
            if (value==min){
                arrSize++;
            }
        }

        int [] b = new int[a.length-arrSize];
        int j=0;
        for (int i=0;i<a.length;i++) {
            if (a[i]!=min){
                b[j]=a[i];
                j++;
            }
        }
        PrintArrays.printOneDimensionalArrays(b);


    }

}

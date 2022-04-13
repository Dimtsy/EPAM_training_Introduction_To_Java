package algorithmization.oneDimensionalArraysSorting;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task6 {
    public static void task6() {
        System.out.println("6. Сортировка Шелла. Дан массив n действительных чисел. " +
                "Требуется упорядочить его по возрастанию." );
        int[]a=new int[10];
        CreatingArrays.oneDimensionalNaturalArrays(a);
        int b;
        for (int i=0;i< a.length-1;i++){
            int j=i;
            while (a[j+1]<a[j]){
                b=a[j+1];
                a[j+1]=a[j];
                a[j]=b;
                if(j>0){
                    j--;
                }
            }
        }
        PrintArrays.printOneDimensionalArrays(a);
    }
}

package algorithmization.decomposition;

import algorithmization.CreatingArrays;

public class Task5 {
    public static void task5() {
        System.out.println("5. Составить программу, которая в массиве A[N] находит второе" +
                " по величине число (вывести на печать число, которое меньше максимального" +
                " элемента массива, но больше всех других элементов).");

        int[]a=new int[10];
        CreatingArrays.oneDimensionalNaturalArrays(a);
        int max=a[0];
        int min=a[0];
        for (int i=0;i< a.length;i++){
            if(a[i]>=max){
                max=a[i];
            }
            if(a[i]<=min){
                min=a[i];
            }
        }

        for (int i=0;i< a.length;i++){
            if(a[i]<max&&a[i]>=min){
                min=a[i];
            }
        }
        System.out.println("Число меньше максимального элемента массива," +
                " но больше всех других элементов:\n ="+ min);
    }
}

package algorithmization.oneDimensionalArrays;

import algorithmization.PrintArrays;

import java.util.Random;

public class Task4 {
    public static void task4() {
        System.out.println("4. Даны действительные числа а1 ,а2 ,..., аn . " +
                "Поменять местами наибольший и наименьший элементы.");

        double max = 0;
        double min = 0;
        int d = 0;
        int m = 0;
        double[] a = new double[5];
        Random random = new Random();
        for (int i=0;i<a.length;i++){
            a[i]= (random.nextDouble()-0.5)*10;//действительные числа 0т -5 до 5
            if (i==0){
                max = a[i];
                min = a[i];
            }
            if(a[i]>max){
                max=a[i];
                d=i;
            }
            if(a[i]<min){
                min=a[i];
                m=i;
            }
        }
        PrintArrays.printOneDimensionalArrays(a);
        a[d] = min;
        a[m] = max;
        PrintArrays.printOneDimensionalArrays(a);
    }
}

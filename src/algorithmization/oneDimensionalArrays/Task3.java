package algorithmization.oneDimensionalArrays;

import algorithmization.PrintArrays;

import java.util.Random;

public class Task3 {
    public static void task3() {
        System.out.println("Дан массив действительных чисел, размерность которого N. " +
                "Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов.");
        int b = 0;
        int c = 0;
        int d = 0;
        int[] a = new int[5];
        Random random = new Random();
        for (int i=0;i<a.length;i++){
            a[i]= random.nextInt(21)-10;
            if(a[i]==0){
                b++;
            }
            if(a[i]>0){
                c++;
            }
            if(a[i]<0){
                d++;
            }
        }
        PrintArrays.printOneDimensionalArrays(a);
        System.out.println("zero = "+b+"\nminus = "+d+"\nplus = " + c);

    }
}

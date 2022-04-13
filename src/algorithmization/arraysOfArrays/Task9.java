package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;

public class Task9 {
    public static void task9() {
        System.out.println("9. Задана матрица неотрицательных чисел." +
                " Посчитать сумму элементов в каждом столбце. Определить, какой\n" +
                "столбец содержит максимальную сумму.\n");

        int [][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        int sumMax=0;
        int count=0;
        for (int i=0;i<a.length;i++){
            int sum=0;
            for (int j=0;j<a.length;j++){
                sum += a[j][i];

            }
            System.out.println("сумма столбца "+i+" = "+sum);
            if (sum>sumMax){
                sumMax=sum;
                count=i;
            }
        }
        System.out.println("Максимальная сумма в "+count+" столбце = "+sumMax);
    }
}

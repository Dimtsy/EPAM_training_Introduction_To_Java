package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;

public class Task10 {
    public static void task10() {
        System.out.println("10. Найти положительные элементы главной диагонали квадратной матрицы");

        double[][]a=new double[5][5];

        CreateTwoDimensionalArray.realArray(a);

        System.out.println("Положительные элементы главной диагонали:");
        for (int i=0;i<a.length;i++){
                if (a[i][i]>0){
                    System.out.println(a[i][i]);
                }
        }
    }
}

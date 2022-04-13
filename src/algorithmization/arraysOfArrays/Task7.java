package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

public class Task7 {
    public static void task7() {
        System.out.println("7. Сформировать квадратную матрицу порядка N по правилу:" +
                "и подсчитать количество положительных элементов в ней. ");

        int n =4;
        int k =0;
        double [][]a=new double[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=Math.sin((i*i-j*j)/n);
                if (a[i][j]>0){
                    k++;
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
        System.out.println("Положительных элементов = "+k);
    }
}

package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

public class Task5 {
    public static void task5() {
        System.out.println("5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):...");
        int n=6;
        System.out.println("n = "+n);
        int[][]a= new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                 a[i][j]=i+1;
            }
        }
        PrintTwoDimensionalArray.printInt(a);

    }
}

package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

public class Task6 {
    public static void task6() {
        System.out.println("6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):...");

        int n=6;
        int a[][] = new int[n][n];
        for (int i=0;i< n/2;i++){
            for (int j=i;j< n-i;j++){
                a[i][j]=1;
            }
        }
        for (int i=n/2;i< n;i++){
            for (int j=n-i-1;j<= i;j++){
                a[i][j]=1;
            }
        }
       PrintTwoDimensionalArray.printInt(a);
    }
}

package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

import java.util.Random;

public class Task14 {
    public static void task14() {
        System.out.println("14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц," +
                " причем в каждом столбце число единиц равно номеру столбца.");

        int m=6;
        int n=5;

        int[][]a=new int[m][n];

        Random random = new Random();

        for (int j=0;j<n;j++) {
            int counter1=0;
            int counter0=0;
            for (int i = 0; i < m; i++) {
                a[i][j] = random.nextInt(2) ;
                if (a[i][j]==1){
                    counter1++;
                }
                if (counter1>j){
                    a[i][j]=0;
                }
                if (a[i][j]==0){
                    counter0++;
                }
                if (counter0>m-j){
                    a[i][j]=1;
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
    }
}

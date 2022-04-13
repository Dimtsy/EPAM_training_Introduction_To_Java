package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;
import algorithmization.PrintTwoDimensionalArray;

public class Task15 {
    public static void task15() {
        System.out.println("15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.");

        int m=6;
        int n=5;

        int[][]a=new int[m][n];
        CreateTwoDimensionalArray.naturalArray(a);

        int valueMax = a[0][0];

        for (int j=0;j<n;j++) {
            for (int i = 0; i < m; i++) {
                if(a[i][j]>valueMax){
                    valueMax = a[i][j];
                }
            }
        }

        for (int j=0;j<n;j++) {
            for (int i = 0; i < m; i++) {
                if(a[i][j]%2==0){
                    a[i][j]=valueMax;
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
    }
}

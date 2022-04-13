package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

public class Task4 {
    public static void task4() {
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):...");
        int n=4;
        System.out.println("n = "+n);
        int a[][]=new int[n][n];
        for (int i=0;i<a.length;i++){
            if(i==0|(i%2==0)){
                for (int j=0;j<a.length;j++){
                    a[i][j]=j+1;
                }
            }else {
                for (int j=0;j<a.length;j++){
                    a[i][j]=n-j;
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
    }
}

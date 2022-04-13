package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;

public class Task3 {
    public static void task3() {
        System.out.println("3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        int[][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        int k=3;
        int p=4;
        System.out.println("k=" +k+"\n result");
        for (int i=0;i< a.length;i++){
            System.out.print(" "+a[k][i]);
        }
        System.out.println("\np= "+p+"\n result");
        for (int i=0;i< a[0].length;i++){
            System.out.println(a[i][p]);
        }
    }
}

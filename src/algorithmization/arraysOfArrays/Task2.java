package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;

public class Task2 {
    public static void task2() {
        System.out.println("2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");

        int[][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        System.out.print("result ");
        for (int i=0;i<a.length;i++){
            System.out.print(" "+a[i][i]);
        }
        System.out.println("");
    }
}

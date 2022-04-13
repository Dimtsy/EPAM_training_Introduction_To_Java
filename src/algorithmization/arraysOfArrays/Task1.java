package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;
import algorithmization.PrintTwoDimensionalArray;

public class Task1 {
    public static void task1() {
        System.out.println("1. Дана матрица. Вывести на экран все нечетные столбцы," +
                " у которых первый элемент больше последнего.");
        int height =3;
        int width =10;
        int[][]a=new int[height][width];
        int count =0;
        CreateTwoDimensionalArray.naturalArray(a);
        for (int i=0;i< width;i=i+2){
            if(a[0][i]>a[height-1][i]){
                count++;
            }
        }
        int[][]b=new int[height][count];

        int z=0;//счетчик столбцов в результирующем массиве
        for (int i=0;i< width;i=i+2){
            if(a[0][i]>a[height-1][i]){
                for (int j=0;j< height;j++){
                    b[j][z]=a[j][i];
                }
                z++;
            }
        }
        PrintTwoDimensionalArray.printInt(b);


    }
}

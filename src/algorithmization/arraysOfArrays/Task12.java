package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;
import algorithmization.PrintTwoDimensionalArray;

public class Task12 {
    public static void task12() {
        System.out.println("12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
        int[][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        int m;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(a[i][j]<a[i][k]){
                            m=a[i][j];
                        a[i][j]=a[i][k];
                        a[i][k]=m;
                    }
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(a[i][j]>a[i][k]){
                        m=a[i][j];
                        a[i][j]=a[i][k];
                        a[i][k]=m;
                    }
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
    }
}

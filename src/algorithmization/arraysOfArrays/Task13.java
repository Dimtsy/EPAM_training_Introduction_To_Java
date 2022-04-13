package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;
import algorithmization.PrintTwoDimensionalArray;

public class Task13 {
    public static void task13() {
        System.out.println("13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.");

        int[][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        int m;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(a[j][i]<a[k][i]){
                        m=a[j][i];
                        a[j][i]=a[k][i];
                        a[k][i]=m;
                    }
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(a[j][i]>a[k][i]){
                        m=a[j][i];
                        a[j][i]=a[k][i];
                        a[k][i]=m;
                    }
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);
    }

}

package algorithmization.arraysOfArrays;

import algorithmization.CreateTwoDimensionalArray;
import algorithmization.PrintTwoDimensionalArray;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("8. В числовой матрице поменять местами два столбца любых столбца, " +
                "т. е. все элементы одного столбца поставить " +
                "на соответствующие им позиции другого, а его элементы второго переместить в первый." +
                " Номера столбцов вводит пользователь с клавиатуры.");

        int [][]a=new int[5][5];
        CreateTwoDimensionalArray.naturalArray(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер первого столбца:");
        int k1 = Integer.parseInt(scanner.next());
        System.out.println("Введите номер второго столбца:");
        int k2 = Integer.parseInt(scanner.next());
        int m;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(j==k1){
                    m=a[i][j];
                    a[i][j]= a[i][k2];
                    a[i][k2]= m;
                }
            }
        }
        PrintTwoDimensionalArray.printInt(a);

    }
}

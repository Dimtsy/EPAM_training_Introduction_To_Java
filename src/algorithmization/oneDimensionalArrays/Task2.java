package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task2 {
    public static void task2(){
        System.out.println("2. Дана последовательность действительных чисел а1 ,а2 ,..., ап." +
                " Заменить все ее члены, большие данного Z, этим\n" +
                "числом. Подсчитать количество замен.");
        int sum=0;
        int z = 3;
        int [] a = new int[5];

        CreatingArrays.oneDimensionalNaturalArrays(a);

        for (int i=0;i< a.length;i++){
            if(a[i]>z){
                a[i]=z;
                sum++;
            }
        }

        System.out.println("Число Z = "+z);
        PrintArrays.printOneDimensionalArrays(a);
        System.out.println("Число число замен = "+sum);
    }
}

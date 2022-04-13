package algorithmization.decomposition;

import algorithmization.CreatingArrays;

public class Task8 {
    public static void task8() {
        System.out.println("8. Задан массив D. Определить следующие суммы:" +
                " D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]." +
                "Пояснение. Составить метод(методы) для вычисления суммы трех последовательно" +
                " расположенных элементов массива с номерами от k до m.");

        int[]a=new int[20];
        int[]b= {1,3,4};
        CreatingArrays.oneDimensionalNaturalArrays(a);


        for (int i=0;i<b.length;i++){
            int sum=0;
            System.out.println("при k = "+b[i]+":");
            for (int j=b[i];j<a.length&&j<b[i]+3;j++){
                sum+=a[j];
                System.out.print("D["+j+"] = "+a[j]+"; ");
            }
            System.out.println("сумма = "+sum);
        }

    }
}

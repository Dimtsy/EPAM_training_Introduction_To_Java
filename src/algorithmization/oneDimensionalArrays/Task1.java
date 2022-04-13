package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;

public class Task1 {
    public static void task1(){
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        int sum=0;
        int k = 3;
        int [] a = new int[5];

        CreatingArrays.oneDimensionalNaturalArrays(a);

        for (int i=0;i< a.length;i++){
            if(a[i]%k==0){
                sum += a[i];
            }
        }

        System.out.println("Число k "+k);
        System.out.println("Сумма "+sum);
    }
}

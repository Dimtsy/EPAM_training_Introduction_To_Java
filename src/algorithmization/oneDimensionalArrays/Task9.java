package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;

public class Task9 {
    public static void task9() {
        System.out.println("9. В массиве целых чисел с количеством элементов " +
                "n найти наиболее часто встречающееся число. Если таких чисел несколько," +
                " то определить наименьшее из них");

        int[] a = new int[10];

        int numberMax=0;
        int value=0;
        boolean flag=false;
        CreatingArrays.oneDimensionalNaturalArrays(a);

        for (int i=0;i<a.length;i++){
            int number=0;
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    number++;
                    flag=true;
                }
            }
            if(number>numberMax){
                numberMax=number;
                value=a[i];
            }else {
                if (number == numberMax) {
                    if (a[i] < value) {
                        value = a[i];
                    }

                }
            }
        }
        if(flag){
            System.out.println("Наиболее повторяющеяся число = "+ value+" повторяется "+(numberMax+1)+" раз");
        }else {
            System.out.println("Повторяющихся чисел нет");
        }
    }
}

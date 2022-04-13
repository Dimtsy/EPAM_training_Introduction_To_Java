package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;

public class Task6 {
    public static void task6() {
        System.out.println("6. Задана последовательность N вещественных чисел." +
                " Вычислить сумму чисел, порядковые номера которых\n" +
                "являются простыми числами.");
         int sum = 0;
        int [] a = new int[10];

        CreatingArrays.oneDimensionalNaturalArrays(a);

        for (int i=0;i< a.length;i++){
            int b=2;
            if(i>1){
                for (int j=2;j<=i;j++){

                    if(i%b!=0){
                        b++;
                    }else if (i==b){
                        sum += a[i];
                        System.out.println("Число "+ a[i]+" порядковый номер "+i);
                    }else {
                        break;
                    }
                }
            }

        }
        System.out.println("Сумма =  "+sum);
    }
}

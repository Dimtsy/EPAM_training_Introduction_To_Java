package algorithmization.decomposition;

import algorithmization.PrintArrays;

public class Task10 {
    public static void task10() {
        System.out.println("10. Дано натуральное число N. Написать метод(методы) для формирования массива," +
                " элементами которого являются цифры числа N.");

        int n = 464456;
        System.out.println("Дано число "+n);
        int n2=n;

        int k=1;
        while (n>10){
            n=n/10;
            k++;
        }

        int a[]=new int[k];

        for (int i=0;i<a.length;i++){
            a[i]=n2%10;
            n2=n2/10;
        }

        PrintArrays.printOneDimensionalArrays(a);

    }
}

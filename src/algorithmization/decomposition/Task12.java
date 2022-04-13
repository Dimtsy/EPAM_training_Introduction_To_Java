package algorithmization.decomposition;

import algorithmization.PrintArrays;

public class Task12 {
    public static void task12() {
        System.out.println("12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого\n" +
                "являются числа, сумма цифр которых равна К и которые не большее N.");

        int k=5;
        int n=40;
        System.out.println("N = "+n+"; K = "+k);
        int a;

        int count=0;
        for (int i=0;i<=n;i++){
            int t=i;
            int sum=0;
            while (t>0){
                a=t%10;
                sum+=a;
                t=t/10;
            }
            if(sum==k){
               count++;

            }
        }

        int []p=new int[count];

        int j=0;
        for (int i=0;i<=n;i++){
            int t=i;
            int sum=0;
            while (t>0){
                a=t%10;
                sum+=a;
                t=t/10;
            }
            if(sum==k){
                p[j]=i;
                j++;
            }
        }
        PrintArrays.printOneDimensionalArrays(p);
    }

}

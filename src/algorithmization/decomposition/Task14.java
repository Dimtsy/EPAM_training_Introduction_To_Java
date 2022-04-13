package algorithmization.decomposition;

import algorithmization.PrintArrays;

public class Task14 {
    public static void task14() {
        System.out.println("14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,\n" +
                "возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи\n" +
                "использовать декомпозицию.");

        int k=500;
        System.out.print("Все числа Армстронга от 1 до "+k+" = ");
        for(int i=1;i<=k;i++){
            int[]a=armstrong(i);

            double sum=0;
            for(int j=0;j<a.length;j++){
                sum+=Math.pow(a[j],a.length);

            }

            if(sum==i){
                System.out.print(" "+i+"; ");
            }

        }
    }
    public static int[] armstrong(int a){

        int count=0;
        int a2=a;
        while (a2>0){
            a2=a2/10;
            count++;
        }
        int []c=new int[count];
        int j=0;
        while (a>0){
            c[j]=a%10;
            a=a/10;
            j++;
        }
        return c;
    }
}

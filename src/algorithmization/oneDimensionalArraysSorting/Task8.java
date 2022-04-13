package algorithmization.oneDimensionalArraysSorting;

import java.util.Random;

public class Task8 {
    public static void task8() {
        System.out.println("8. Даны дроби. Составить программу, которая приводит эти дроби к общему " +
                "знаменателю и упорядочивает их в порядке возрастания.");
        int[]a=new int[7];
        int[]b=new int[7];
//        int[]a={1,2,4,2,4};
//        int[]b={1,4,5,2,7};

        Random random = new Random();

        for (int i=0;i<a.length;i++){
            a[i]=random.nextInt(9)+1;
            b[i]=random.nextInt(9)+1;
            if (i==a.length-1){
                System.out.print(" "+a[i]+"/"+b[i]);
            }else {
            System.out.print(" "+a[i]+"/"+b[i]+",");}
        }


        int minDenominator=b[0];
        for (int i=1;i<b.length;i++) {
            if(b[i]>minDenominator){
                minDenominator=b[i];
            }
        }

        for (int i=0;i<b.length;i++) {
            minDenominator=minDenominator*b[i]/gcdAlgorithmModulo(minDenominator, b[i]);

        }


        for (int i=0;i<a.length;i++) {
            a[i]= minDenominator/b[i]*a[i];
        }

        System.out.println("\nДроби преведенные к общему знаменателю:");
        for (int i=0;i<a.length;i++){
            if (i==a.length-1){
                System.out.print(" "+a[i]+"/"+minDenominator);
            }else {
                System.out.print(" "+a[i]+"/"+minDenominator+",");}
        }

        int ch;
        for (int i=0;i< a.length-1;i++){
            int j=i;
            while (a[j+1]<a[j]){
                ch=a[j+1];
                a[j+1]=a[j];
                a[j]=ch;
                if(j>0){
                    j--;
                }
            }
        }

        System.out.println("\nДроби отсортированны по возрастанию:");

        for (int i=0;i<a.length;i++){
            if (i==a.length-1){
                System.out.print(" "+a[i]+"/"+minDenominator);
            }else {
                System.out.print(" "+a[i]+"/"+minDenominator+",");}
        }

    }


    public static int gcdAlgorithmModulo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}


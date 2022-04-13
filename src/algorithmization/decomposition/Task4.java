package algorithmization.decomposition;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Task4 {
    public static void task4() {
        System.out.println("4. На плоскости заданы своими координатами n точек. Написать метод(методы)," +
                " определяющие, между какими из пар точек самое большое расстояние. Указание." +
                " Координаты точек занести в массив.");

        int[]a=new int[10];
        int[]b=new int[10];
        char[]c = {'A','B','C','D','E','F','G','H','I','J'};

        Random random = new Random();
        System.out.println("Пусть даны точки:");
        for (int i=0;i<a.length;i++){
            a[i]=random.nextInt(20);
            b[i]=random.nextInt(20);
            if (i==a.length-1){
                System.out.print(c[i]+"("+a[i]+";"+b[i]+") ");
            }else {
                System.out.print(c[i]+"("+a[i]+";"+b[i]+"), ");}
        }
        double lMax=0;
        int[]d=new int[2];

        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                double l= sqrt((a[i] - a[j])*(a[i] - a[j]) + (b[i] - b[j])*(b[i] - b[j]));
                //AB = √(xb - xa)2 + (yb - ya)2 - формуна нахождения расстояния между точками
             if(l>lMax){
                 lMax=l;
                 d= new int[]{i, j};
             }
            }
        }
        System.out.println("\nСамое большое расстояние между точками:\n "+c[d[0]]+"("+a[d[0]]+";"+b[d[0]]+") и "
                +c[d[1]]+"("+a[d[1]]+";"+b[d[1]]+")"+"\n расстояние = "+lMax);

    }
}

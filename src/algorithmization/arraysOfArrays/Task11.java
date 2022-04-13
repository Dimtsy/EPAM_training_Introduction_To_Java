package algorithmization.arraysOfArrays;

import java.util.Random;

public class Task11 {
    public static void task11() {
        System.out.println("11. Матрицу 10x20 заполнить случайными числами от 0 до 15." +
                " Вывести на экран саму матрицу и номера строк, в которых число 5 встречается" +
                " три и более раз.");

        int[][]a=new int[10][20];

        Random random = new Random();

        System.out.println("Arrays");
        for (int i=0;i<a.length;i++) {
            System.out.print("[");
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = random.nextInt(15);
                System.out.print(" " + a[i][j]);
            }
            System.out.println("]");
        }

        for (int i=0;i<a.length;i++) {
            int five=0;
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==5){
                    five++;
                }
            }
            if(five>=3){
                System.out.println("В строке "+i+" число 5 встречается три и более раз");
            }

        }
    }
}

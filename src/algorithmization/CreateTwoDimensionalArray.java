package algorithmization;

import java.util.Random;

public class CreateTwoDimensionalArray {
    public static void naturalArray(int[][] mas) {
        Random random = new Random();
        System.out.println("Arrays");
        for (int i=0;i<mas.length;i++) {
            System.out.print("[");
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = random.nextInt(9) + 1;//натуральные числа от 1 до 10
                //натуральные числа, это целые числа, начинаются с 1, 2, 3.. и т.д.
                System.out.print(" " + mas[i][j]);
            }
            System.out.println("]");
        }
    }
    public static void realArray(double[][] mas) {
        Random random = new Random();
        System.out.println("Arrays");
        for (int i=0;i<mas.length;i++) {
            System.out.print("[");
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j]=(random.nextDouble()-0.5)*10;//действительные числа 0т -5 до 5
                //действительные числа это любые рац и иррац числа, дробные, пол, отриц, ноль.
                System.out.print(" " + mas[i][j]);
            }
            System.out.println("]");
        }
    }

}

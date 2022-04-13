package algorithmization;

public class PrintTwoDimensionalArray {
    public static void printInt(int[][] mas) {
        System.out.println("Result arrays");
        for (int i=0;i<mas.length;i++) {
            System.out.print("[");
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.println("]");
        }
    }
    public static void printInt(double[][] mas) {
        System.out.println("Result arrays");
        for (int i=0;i<mas.length;i++) {
            System.out.print("[");
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.println("]");
        }
    }
}

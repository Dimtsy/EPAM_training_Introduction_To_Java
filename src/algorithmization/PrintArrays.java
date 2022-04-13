package algorithmization;

public class PrintArrays {
    public static void printOneDimensionalArrays(int[] arr) {
        System.out.print("Arrays[");
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("]");
    }
    public static void printOneDimensionalArrays(double[] arr) {
        System.out.print("Arrays[");
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("]");
    }
}

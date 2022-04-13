package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;

public class Task7 {
    public static void task7() {
        System.out.println("7. Даны действительные числа a1, a2,..., an" +
                ". Найти max( a1+a2n, a2 + a2n−1,...,an+an+1 ).");
        double[]a=new double[6];


        CreatingArrays.oneDimensionalRealArrays(a);
        double sum;
        double max=a[0];
        for (int i=0;i<a.length/2;i++){
            sum=a[i]+a[a.length-i-1];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println("max( a1+a2n, a2 + a2n−1,...,an+an+1 ) = "+max);
    }
}

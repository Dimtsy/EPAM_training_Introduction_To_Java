package algorithmization.oneDimensionalArraysSorting;

import algorithmization.PrintArrays;

public class Task2 {
    public static void task2() {
        System.out.println("2. Даны две последовательности. Образовать из них новую последовательность" +
                " чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.");

        int[]a= {1,2,3,4,5};
        int[]b= {1,3,5,7,8,9};
        int[]c=new int[a.length+b.length];

        int count=0;
        int count2=0;
        for (int i=0;i<c.length;i++){
            if (count== a.length){
                c[i]=b[count2];
                count2++;
            }else if (count2== b.length){
                c[i]=a[count];
                count++;
            }else if(a[count]<b[count2]){
                c[i]=a[count];
                count++;
            }else if(a[count]==b[count2]){
                c[i]=a[count];
                count++;
            }else if(b[count2]<a[count]){
                c[i]=b[count2];
                count2++;
            }
        }
        PrintArrays.printOneDimensionalArrays(c);
    }
}

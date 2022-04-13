package algorithmization.oneDimensionalArrays;

import algorithmization.CreatingArrays;
import algorithmization.PrintArrays;

public class Task10 {
    public static void task10() {
        System.out.println("10. Дан целочисленный массив с количеством элементов п. Сжать массив," +
                " выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями)." +
                " Примечание. Дополнительный массив не использовать.");
        int[]a=new int[9];
        CreatingArrays.oneDimensionalNaturalArrays(a);

        int k=0;
        if (a.length%2!=0){//если массив не четный добавляем 1
            k=1;
        }
        for(int i=1;i<a.length/2+k;i++){
            a[i]=a[i*2];
        }
        for(int i=a.length/2+k;i<a.length;i++){
            a[i]=0;
        }
        PrintArrays.printOneDimensionalArrays(a);
    }

}

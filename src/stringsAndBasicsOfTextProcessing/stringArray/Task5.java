package stringsAndBasicsOfTextProcessing.stringArray;

import java.util.Arrays;

public class Task5 {
    public static void task5() {
        System.out.println("5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.\n" +
                "Крайние пробелы в строке удалить.");

        String a = "         sdf fsfs      sffsf   sdsfsd               ";
        System.out.println("Дана строка:\n"+a);
        char[] aCh= a.toCharArray();
        char emp=' ';
        boolean flag=true;
        int count=0;
        int cht=0;
        for(int i=0;i< aCh.length;i++){
            if(aCh[i]==emp){
                if(flag){
                    count++;
                }
                if(!flag){
                    cht++;
                    if(cht>1){
                        count++;
                    }else {
                        aCh[i-count]=aCh[i];
                    }
                }
                if(i==aCh.length-1){
                    count++;
                }
            }else {
                aCh[i-count]=aCh[i];
                flag=false;
                cht=0;
            }
        }

        char[]b= new char[aCh.length-count];

        for(int i=0;i< b.length;i++){
            b[i]=aCh[i];
        }
        System.out.println("Строка с заменами:");
        System.out.println(b);
        System.out.println("Массив:");
        System.out.println(Arrays.toString(b));

    }
}

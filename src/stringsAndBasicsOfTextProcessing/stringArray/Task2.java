package stringsAndBasicsOfTextProcessing.stringArray;

import java.util.Arrays;

public class Task2 {
    public static void task2() {
        System.out.println("2. Замените в строке все вхождения 'word' на 'letter'.");

        String str = "wore word worgdgfdgword wor wo sddgwordword";
        System.out.println("Дана строка:\n"+str+"\nСтрока с заменами:");
        char[] strChar= str.toCharArray();
        String word="word";
        char[] wordChar=word.toCharArray();
        String letter="letter";
        char[] letterChar=letter.toCharArray();
        int k=0;
        int count=0;
        for(int i=0;i< strChar.length;i++){
            if(strChar[i]==wordChar[k]){
                k++;
                if(k==wordChar.length){
                    count++;
                    k=0;
                }
            }else {
                k=0;
            }
        }

        char[] strChar2=new char[strChar.length+ (letterChar.length-wordChar.length)*count];


        k=0;
        for(int i=0,j=0;i<strChar.length;i++){
            if(strChar[i]==wordChar[k]){
                k++;
                if(k==wordChar.length){
                    for (char ch:letterChar) {
                        strChar2[j]=ch;
                        System.out.print(ch);
                        j++;
                    }
                    k=0;
                }
            }else {
                if(k>0){
                    i=i-k;
                }
                strChar2[j]=strChar[i];
                System.out.print(strChar[i]);
                j++;
                k=0;
            }
        }
        System.out.println();

    }
}

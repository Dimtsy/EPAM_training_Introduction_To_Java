package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task5 {
    public static void task5() {
        System.out.println("5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.");

        String a= "aa dfdsfdasafdfdsd";
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'){
                count++;
            };
        }

        System.out.println("В строке:\n"+a+count+" \na = "+count);
    }
}

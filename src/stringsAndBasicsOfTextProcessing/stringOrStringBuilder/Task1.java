package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task1 {
    public static void task1() {
        System.out.println("Работа со строкой как с объектом типа String или StringBuilder\n" +
                "1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.");
        String a = "sdsds    dds dfdf  dsdd ";
        int count=0;
        int countMax=0;
        StringBuilder stringBuilder = new StringBuilder(a);
        for (int i=0;i<stringBuilder.length();i++){
            if(stringBuilder.charAt(i)==' '){
                count++;
            }else {
                if(count>countMax){
                    countMax=count;
                }
                count=0;
            }
        }
        System.out.println("В строке:\n"+a+"\nМамсимальное количество пробелов = "+countMax );
    }
}

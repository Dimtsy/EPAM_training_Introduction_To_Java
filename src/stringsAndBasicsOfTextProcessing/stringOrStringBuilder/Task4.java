package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task4 {
    public static void task4() {
        System.out.println("4. С помощью функции копирования и операции конкатенации составить " +
                "из частей слова “информатика” слово “торт”.");

        String a = "информатика";
        String b="";
        char []aCh= a.toCharArray();
        b=b.concat(String.copyValueOf(aCh,a.indexOf('т'),1));
        b=b.concat(String.copyValueOf(aCh,a.indexOf('о'),1));
        b=b.concat(String.copyValueOf(aCh,a.indexOf('р'),1));
        b=b.concat(String.copyValueOf(aCh,a.indexOf('т'),1));

        System.out.println(b);
    }
}

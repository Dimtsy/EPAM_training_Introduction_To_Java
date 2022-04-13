package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task6 {
    public static void task6() {
        System.out.println("6. Из заданной строки получить новую, повторив каждый символ дважды.");

        String a = " dfsfnnb  fsfsdsf";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<a.length();i++){
            stringBuilder.append(a.charAt(i));
            stringBuilder.append(a.charAt(i));
        }
        System.out.println("Дано:\n"+a+"\nПосле вставки:\n"+stringBuilder);
    }
}

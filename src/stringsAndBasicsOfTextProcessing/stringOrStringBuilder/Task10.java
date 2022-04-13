package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task10 {
    public static void task10() {
        System.out.println("10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой," +
                " восклицательным или вопросительным знаком. Определить количество предложений в строке X.");

        String a = "KJkjkjkj! KKKMKKkmkmkmk! sds. ssff?";
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.'||a.charAt(i) == '!'||a.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("В строке:\n"+a+"\n"+count+" предложений");
    }
}

package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task8 {
    public static void task8() {
        System.out.println("8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово" +
                " и вывести его на экран. Случай, когда самых длинных слов может быть несколько," +
                " не обрабатывать.");

        String a="dfss ffsdffssffsfsfsffsdff tttttttttttttttttttw ";
        String[] b=a.split(" ");
        int max=0;
        String answer = null;
        for (String s: b) {
            if (s.length() == max) {
                answer = null;
            }
            if (s.length()>max) {
                max=s.length();
                answer=s;
            }
        }
        if (answer != null) {
            System.out.println(answer);
        }

    }
}

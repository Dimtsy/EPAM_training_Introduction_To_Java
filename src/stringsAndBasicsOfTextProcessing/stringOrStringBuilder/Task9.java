package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task9 {
    public static void task9() {
        System.out.println("9. Посчитать количество строчных (маленьких) и прописных (больших) букв" +
                " в введенной строке. Учитывать только английские буквы.");

        String a="HJ fdg ыв ВВ";
        int upperCase=0;
        int lowerCase=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a'&&a.charAt(i)<='z') {
                lowerCase++;
            }else if (a.charAt(i) >= 'A'&&a.charAt(i)<='Z') {
                upperCase++;
            }
        }
        System.out.println("В строке:\n"+a+"\nCтрочных:\n" + lowerCase+"\nПрописных:\n"+upperCase);
    }
}

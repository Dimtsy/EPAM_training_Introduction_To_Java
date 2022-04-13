package stringsAndBasicsOfTextProcessing.patternMatcher;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий\n" +
                "тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи\n" +
                "нельзя.");
        String xml = "<notes>\n" +
                " <note id = \"1\">\n" +
                " <to>Вася</to>\n" +
                " <from>Света</from>\n" +
                " <heading>Напоминание</heading>\n" +
                " <body>Позвони мне завтра!</body>\n" +
                " </note>\n" +
                " <note id = \"2\">\n" +
                " <to>Петя</to>\n" +
                " <from>Маша</from>\n" +
                " <heading>Важное напоминание</heading>\n" +
                " <body/>\n" +
                " </note>\n" +
                "</notes>\n";
        System.out.println(xml);
                                       //              1                 3(2)    4      5          6          7        8
        Pattern pattern = Pattern.compile("(<[^/>]+?>\\s*\n*</.+?>)|((<[^/>]+?>)(.+)(</.+?>))|(<[^/>]+?>)|(</.+?>)|(<.+? />)");
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println("Tег без тела: " + matcher.group(1));
            }else if (matcher.group(2) != null ) {
                System.out.println(" Открывающий тег(текст): " + matcher.group(3) + "\n содержимое тега: " + matcher.group(4) + "\n закрывающий тег(текст): " + matcher.group(5));
            } else if (matcher.group(5) == null && matcher.group(6) != null) {
                System.out.println("Открывающий тег: " + matcher.group(6));
            } else if (matcher.group(6) == null && matcher.group(7) != null) {
                System.out.println("Закрывающий тег: " + matcher.group(7));
            } else if (matcher.group(8) != null) {
                System.out.println("Tег без тела: " + matcher.group(8));
            }
        }

    }
}

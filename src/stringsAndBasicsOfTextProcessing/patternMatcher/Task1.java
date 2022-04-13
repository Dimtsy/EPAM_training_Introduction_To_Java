package stringsAndBasicsOfTextProcessing.patternMatcher;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Работа с регулярными выражениями (Pattern, Matcher)\n" +
                "1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных\n" +
                "операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;\n" +
                "отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по\n" +
                "алфавиту.");
        String a = " Начался крестьянский бунт. Начался крестьянский бунт. Начался крестьянский бунт.Бунтовщики захватили гарнизон, убили капитана и хотели повесить Гринёва, но его узнал главарь бунтовщиков — как-то зимой он остался без тёплой одежды, и Гринёв подарил ему заячий тулуп.\n" +
                "Гринёву пришлось оставить любимую и уехать. Вскоре он получил от неё письмо. Сослуживец, перешедший на сторону бунтовщиков, принуждал её к браку, и она просила о помощи.\n" +
                "Гринёв отправился в гарнизон, но попал к бунтовщикам. Главарю понравилась его смелость, и он помог спасти капитанскую дочку. Гринёв отвёз девушку к родителям, а сам отправился воевать с бунтовщиками.";


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nИсходный текст:\n"+a);
        while (true){
            System.out.println("\nВведите букву(лат.):\na - отсортировать абзацы по количеству предложений;" +
                    "\nb - в каждом предложении отсортировать слова по длине;" +
                    "\nc - отсортировать лексемы в предложении по убыванию количества вхождений заданного" +
                    " символа, а в случае равенства – по алфавиту.");
            switch (scanner.next()){
                case "a":
                    countSortSuggestion(a);
                    break;
                case "b":
                    countSortWord(a);
                    break;
                case "c":
                    System.out.println("Введите символ(кирил.):");
                    String ch =scanner.next();
                    countSortLexemes(a,ch);
                    break;
            }
        }
    }

    public static void countSortLexemes (String a, String ch){
        for (String m : sortParagraph(a)) {//массив обзацев
            for (String c : sortSuggestion(m)) {//массив предложений
                String[] k = sortWords(c);
                Arrays.sort(k, (s1, s2) -> {
                    int s1Int =s1.length() - s1.replace(ch, "").length();//число вхождений символа
                    int s2Int =  s2.length() - s2.replace(ch, "").length();
                    if (s1Int < s2Int) {
                        return 1;
                    }
                    if (s1Int == s2Int){//если число вхождений символа равно
                        if(s1.compareTo(s2)>0){//сравниваем по алфавиту
                            return 1;
                        }else {
                            return -1;
                        }
                    }else {
                        return -1;
                    }
                });
                printArrays2(k);
            }
            System.out.println();
        }
    }
    public static void countSortWord (String a){
        for (String m : sortParagraph(a)) {//массив обзацев
            for (String c : sortSuggestion(m)) {//массив предложений
                String[] k = sortWords(c);
                Arrays.sort(k, (s1, s2) -> {
                    if (s1.toCharArray().length >= s2.toCharArray().length) {
                        return 1;
                    } else {
                        return -1;
                    }
                });
                printArrays2(k);
            }
            System.out.println();
        }
    }
    public static void countSortSuggestion (String a){
        String[] b = sortParagraph(a);

        Arrays.sort(b,(p1,p2)->{
            if(sortSuggestion(p1).length>=sortSuggestion(p2).length){
                return 1;
            }else {
                return -1;
            }

        });

        printArrays(b);
    }

    public static void printArrays (String[] a){
        for (String c:a ) {
            System.out.print("\n"+c);
        }
    }
    public static void printArrays2 (String[] a){
        for (String c:a ) {
            System.out.print(" "+c);
        }
        System.out.print(".");
    }
    public static String[] sortParagraph (String a){
        return a.split("\n");
    }
    public static String[] sortSuggestion (String a){
        return a.split("[.?!]+");
    }
    public static String[] sortWords (String a){
        return a.split("[ ,]+");
    }
//    public static String[] sortParagraph (String a){

//        Pattern pattern = Pattern.compile("(\n?.+)");
//        Matcher matcher = pattern.matcher(a);
//        int i=0;
//        while (matcher.find()){
//            i++;
//            System.out.println(1);
//        }
//        String[] m = new String[i];
//        i=0;
//        while (matcher.find()) {
//            System.out.println(2);
//            System.out.println(matcher.find());
//            m[i] = matcher.group();
//            System.out.println(m[i]);
//            i++;
//        }
//        return m;
//    }
//    public static String[] sortSuggestion (String a){
//        Pattern pattern = Pattern.compile("([^.!?]+[.!?])");
//        Matcher matcher = pattern.matcher(a);
//        int i=0;
//        while (matcher.find()){
//            i++;
//        }
//        String[] m = new String[i];
//        Matcher matcher2 = pattern.matcher(a);
//        i=0;
//        while (matcher2.find()) {
//            m[i] = matcher2.group();
//            i++;
//        }
//        return m;
//    }
//    public static String[] sortWords (String a){
//        Pattern pattern = Pattern.compile("[а-яА-я]+");
//        Matcher matcher = pattern.matcher(a);
//        int i=0;
//        while (matcher.find()){
//            i++;
//        }
//        String[] m = new String[i];
//        Matcher matcher2 = pattern.matcher(a);
//        i=0;
//        while (matcher2.find()) {
//            m[i] = matcher2.group();
//            i++;
//        }
//        return m;
//    }

}

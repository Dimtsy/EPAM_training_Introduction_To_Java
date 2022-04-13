package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task2 {
    public static void task2() {
        System.out.println("2. В строке вставить после каждого символа 'a' символ 'b'.");
        String a = " aaaagdg  aaaadfgdgdgdsaas";
        StringBuilder stringBuilder = new StringBuilder(a);
        for (int i=0;i<stringBuilder.length();i++){
            if(stringBuilder.charAt(i)=='a'){
                stringBuilder.insert(i+1,'b');
            }
        }
        System.out.println("Дано:\n"+a+"\nПосле вставки:\n"+stringBuilder);
    }
}

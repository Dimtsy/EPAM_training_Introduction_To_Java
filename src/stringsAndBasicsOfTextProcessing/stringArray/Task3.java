package stringsAndBasicsOfTextProcessing.stringArray;

public class Task3 {
    public static void task3() {
        System.out.println("3. В строке найти количество цифр.");

        String a="erwe feer123xcvxcv1 1 4 ";
        char[] aCh=a.toCharArray();
        char[] bCh={'0','1','2','3','4','5','6','7','8','9',};
        int digital=0;
        for(char aOne:aCh){
            for (char bOne:bCh) {
                if(aOne==bOne){
                    digital++;
                }
            }
        }
        System.out.println("Дана строка:\n"+a+"\nколичество цифр = "+digital);
    }
}

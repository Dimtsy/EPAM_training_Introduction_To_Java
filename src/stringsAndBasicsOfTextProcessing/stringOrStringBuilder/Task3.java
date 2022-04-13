package stringsAndBasicsOfTextProcessing.stringOrStringBuilder;

public class Task3 {
    public static void task3() {
        System.out.println("3. Проверить, является ли заданное слово палиндромом");
        String a = "поп";
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        StringBuilder stringBuilder2 = new StringBuilder(a);
        boolean flag=true;
        for (int i=0;i<stringBuilder.length();i++){
            if(stringBuilder.charAt(i)!=stringBuilder2.charAt(i)){
                flag=false;
            }
        }
        if(flag){
            System.out.println("Слово \""+a+"\" является палиндромом");
        }else {
            System.out.println("Слово \""+a+"\" НE является палиндромом");
        }
    }
}

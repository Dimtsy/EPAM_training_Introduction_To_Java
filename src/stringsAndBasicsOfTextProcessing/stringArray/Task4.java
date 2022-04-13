package stringsAndBasicsOfTextProcessing.stringArray;

public class Task4 {
    public static void task4() {
        System.out.println("4. В строке найти количество чисел.");

        String a="erwe feer123xcvxcv1 1 4 ";
        char[] aCh=a.toCharArray();
        char[] bCh={'0','1','2','3','4','5','6','7','8','9',};
        int count=0;
        boolean flag=false;
        for(char aOne:aCh){
            for (int i=0;i< bCh.length;i++) {
                if(aOne==bCh[i]){
                    flag=true;
                    break;
                }
                if(i== bCh.length-1&&flag==true){
                    flag=false;
                    count++;
                }
            }
        }
        System.out.println("Дана страка:\n"+a+"\nколичество чисел = "+count);
    }
}

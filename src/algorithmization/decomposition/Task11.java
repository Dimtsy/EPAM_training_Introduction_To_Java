package algorithmization.decomposition;

public class Task11 {
    public static void task11() {
        System.out.println("11. Написать метод(методы), определяющий, в каком из данных двух чисел" +
                " больше цифр.");
        int a=8272654;
        int b=7584847;
        System.out.println("a = "+a+";b = "+b);
        if(countDig(a)>countDig(b)){
            System.out.println("a > b");
        }else {
            if(countDig(a)<countDig(b)){
                System.out.println("a < b");
            }else {
                System.out.println("a = b");
            }
        }

    }
    public static int countDig(int a){
        int k=1;
        while (a>10){
            a=a/10;
            k++;
        }
        return k;
    }
}

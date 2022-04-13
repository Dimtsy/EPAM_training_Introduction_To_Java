package algorithmization.decomposition;

public class Task13 {
    public static void task13() {
        System.out.println("13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).\n" +
                "Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для\n" +
                "решения задачи использовать декомпозицию.");

        int n=40;
        int n2=80;
        System.out.println("Из отрезка ["+n+","+n2+"] «близнецами» являются числа:");
        for(int i=n;i<=n2;i++){
            if(prime(i)){
                if(prime(i+2)){
                    System.out.println(i+" и "+(i+2)+"; ");
                }

            }
        }
    }

    public static boolean prime(int a){
        int k=0;
        for (int i =1;i<=a;i++){
            if(a%i==0){
                k++;
            }
        }
        if(k==2){
            return true;
        }else {
            return false;
        }
    }
}

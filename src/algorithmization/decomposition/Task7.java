package algorithmization.decomposition;

public class Task7 {
    public static void task7() {
        System.out.println("7. Написать метод(методы) для вычисления суммы факториалов" +
                " всех нечетных чисел от 1 до 9.");

        int a;
        int sum=0;
        for (int i=0;i<=8;i++){
            a=i+1;
            if(a%2!=0){
                System.out.println("факториал "+a+" = "+factorial(a));
                sum+=factorial(a);
            }
        }
        System.out.println("суммы факториалов всех нечетных чисел от 1 до 9 = "+sum);
    }
    public static int factorial(int a){
        if(a==1){
            return 1;
        }else {
            return a*factorial(a-1);
        }
    }
}

package algorithmization.decomposition;

public class Task17 {
    public static void task17() {
        System.out.println("17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких\n" +
                "действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.");

        int a=137;
        System.out.println("Заданное число = "+a);
        int count=0;
        while (a!=0){
            a=a-sumOfDigits(a);
            count++;
            System.out.print(a+"; ");
        }
        System.out.println("\nПонадобится "+count+" действий");
    }
    public static int sumOfDigits(int a){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}

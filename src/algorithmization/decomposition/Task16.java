package algorithmization.decomposition;

public class Task16 {
    public static void task16() {
        System.out.println("\n 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.\n" +
                "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.");

        int n=3;
        System.out.println("Суммa "+n+"-х - значных чисел, содержащих только нечетные цифры:");
        int max=9;
        for(int i=1;i<n;i++){
            max+=Math.pow(10,i)*9;//находим максимальное n-значное число
        }
        int answer=0;
        for(int i=1;i<=max;i++){
            if(findOddNumbers(i)==n){
                answer+=i;
                System.out.print(i+"; ");
            }
        }
        System.out.println("\nСумма = "+answer);

        System.out.println("Четных цифр в найденной сумме = "+(findCountNumber(answer)-findOddNumbers(answer)));

    }
    private static int findCountNumber(int a){
        int count=0;
        while (a>0) {
            a=a/10;
            count++;
        }
        return count;
    }

    private static int findOddNumbers(int a){
        int count=0;
        int b;
        while (a>0){
            b=a%10;
            if(b%2!=0){
                count++;
            }
            a=a/10;
        }
        return count;
    }
}

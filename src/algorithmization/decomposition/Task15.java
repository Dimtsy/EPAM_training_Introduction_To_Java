package algorithmization.decomposition;

public class Task15 {
    public static void task15() {
        System.out.println("\n15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую\n" +
                "последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.");


        int n=3;
        System.out.println("N = "+n);
        int max=9;
        for(int i=1;i<n;i++){
            max+=Math.pow(10,i)*9;//находим максимальное n-значное число
        }

        for(int i=1;i<=max;i++){
            if(findGrowingNumbers(i,max)==n){
                System.out.print(i+"; ");
            }
        }

    }

    private static int findGrowingNumbers(int a,int b){
        int count=0;
        while (a>0){
            if(b>a%10){//проверяем что-бы последующая цифра в числе была больше предыдущей
                b=a%10;
                count++;
            }
            a=a/10;
        }
        return count;
    }
}

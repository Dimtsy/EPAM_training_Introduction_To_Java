package basicsOfSoftwareCodeDevelopment;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();

    }
    private static void task01(){
        System.out.println("1. Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.");

        double a = 3.5;
        double b = 2.0;
        double c = 1.2;

        double z = ((a - 3) * b / 2.0) + c;
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c +" значение функции z = " + z);

        System.out.println();
    }
    private static void task02(){
        System.out.println("2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        double z=(b + Math.sqrt(b * b + 4 * a * c)) / 2.0 * a - Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c +" значение функции z = " + z);

        System.out.println();
    }

    public static void task03() {
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");

        double x = 60; // значения в градусах
        double y = 60;

        //перевод в радианы
        double xRad = Math.toRadians(x);
//        double xRad = x * Math.PI / 180.0;
        double yRad = Math.toRadians(y);

        double result = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);

        System.out.println("Значение выражения при х = "+x+"; y = "+y +" равно:\n " + result);
        System.out.println();
    }

    public static void task04() {
        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной" +
                " и целой частях). Поменять местами дробную и целую части числа и вывести полученное" +
                " значение числа.");

        double a= 333.444;
        int b = (int) a;
        int c=(int)((a-b)*1000);
        double z=c+(double) b/1000;
        System.out.println("Исходное число: "+a+"\nРезультат: "+z);
        System.out.println();
    }
    public static void task05() {
    System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
            "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. ");

    int init = 3666;

    int hours = (init / 3600);

    int temp = init - (hours * 3600);
    int minutes = temp / 60;

    int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + init);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    public static void task06() {
        System.out.println("6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)\n" +
                "принадлежит закрашенной области, и false — в противном случае: ");
        int x=4;
        int y=-3;
        System.out.print("Проверяем точку ("+x+";"+y+")\nОтвет: " );
//В точке (0;-1) незакрашенная область, если мне это показалось,
// то ответ (x>=-4&&x<=4&&y>=-3&&y<=0||x>=-2&&x<=2&&y>=0&&y<=4)
        // или (x<=4&&x>=2&&y<=0&&y>=-3||x>=-2&&x<=2&&y>=-3&&y<=4||x>=-4&&x<=-2&&y<=0&&y>=-3)

        if(x>=-4&&x<=4&&y>=-3&&y<-1||x>=-4&&x<=4&&y>-1&&y<=0||x>=-4&&x<0&&y>=-3&&y<=0||
                x>0&&x<=4&&y>=-3&&y<=0||x>=-2&&x<=2&&y>=0&&y<=4){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println();

    }

    public static void task07(){
        System.out.println("Ветвления\n" +
                "1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли\n" +
                "он прямоугольным.");
        int a=45;
        int b= 45;
        System.out.println("угол a = "+a+" гр.\nугол b = "+b+" гр.");

        if(a+b<180){
            if(a==90||b==90||180-(a+b)==90){
                System.out.println("Треугольник существует и он прямоугольный");
            }else {
                System.out.println("Треугольник существует но он не прямоугольный");
            }
        }else {
            System.out.println("Треугольника с такими углами не существует");
        }
        System.out.println();
    }

    public static void task08(){
        System.out.println("2. Найти max{min(a, b), min(c, d)}.");

        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int min1,min2,max;
        if(a<b){
            min1=a;
        }else {
            min1=b;
        }
        if(c<d){
            min2=c;
        }else {
            min2=d;
        }
        if(min1>min2){
            max=min1;
        }else {
            max=min2;
        }
        System.out.println("max{min("+a+", "+b+"), min("+c+", "+d+")} = "+max);
        System.out.println();
    }

    public static void task09(){
        System.out.println("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, " +
                "будут ли они расположены на одной прямой.");
        int x1=1;
        int x2=2;
        int x3=3;
        int y1=1;
        int y2=2;
        int y3=3;


        if((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0){
            System.out.println("точки А("+x1+","+y1+"), В("+x2+","+y2+") и С("+x3+","+y3+") лежат в одной плоскости");

        }else {
            System.out.println("точки А("+x1+","+y1+"), В("+x2+","+y3+") и С("+x3+","+y3+") НЕ лежат в одной плоскости");
        }
        System.out.println();
    }

    public static void task10(){
        System.out.println("4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича." +
                " Определить, пройдет ли кирпич через\n" +
                "отверстие.");

        int x=1;
        int y=3;
        int z=2;

        int a=1;
        int b=2;

        if((a>=x&&b>=y||b>=x&&a>=y)||(a>=x&&b>=z||b>=x&&a>=z) || (a>=y&&b>=z||b>=y&&a>=z) ){
            System.out.println("A = "+a+"; B = "+b+"\nx = "+x+"; y = "+y+"; z = "+z+"\nКирпич пройдет в отверстие");
        }else {
            System.out.println("A = "+a+"; B = "+b+"\nx = "+x+"; y = "+y+"; z = "+z+"\nКирпич НЕ пройдет в отверстие");
        }
        System.out.println();
    }

    public static void task11(){
        System.out.println("5.Вычислить значение функции:");
        double x=4;
        double f;
        if(x<=3){
            f=x*x-3*x+9;
        }else {
            f=1/(Math.pow(x,3)+6);
        }
        System.out.println("При x = "+x+"\nF(x) = "+f);

    }
    public static void task12(){
        System.out.println("\nЦиклы\n" +
                "1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует\n" +
                "все числа от 1 до введенного пользователем числа.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int a= Integer.parseInt(scanner.next());
        int b=0;
        for (int i=1;i<=a;i++){
            b+=i;
        }
        System.out.println("Сумма всех чисел от 1 до "+a+" = "+b);
        System.out.println();

    }

    public static void task13(){
        System.out.println("2. Вычислить значения функции на отрезке [а,b] c шагом h:");
        int a = -4;
        int b = 4;
        int h=2;
        System.out.println("на отрезке ["+a+","+b+"] c шагом "+h+":");
        for (int i=a;i<=b;i+=h){
            if(i<=2){
                System.out.print("y = "+-i+";");
            }else {
                System.out.print("y = "+i+";");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void task14(){
        System.out.println("3. Найти сумму квадратов первых ста чисел.");
        int a=0;
        for(int i=0;i<=100;i++){
            a+=i*i;
        }
        System.out.println("Сумма квадратов первых 100 чисел = "+a);
        System.out.println();
    }
    public static void task15(){
        System.out.println("4. Составить программу нахождения произведения квадратов первых двухсот чисел.");
        BigInteger a = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            a = a.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println("Произведение квадратов первых 200 чисел = "+a);
        System.out.println();

    }
    public static void task16(){
        System.out.println("5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен\n" +
                "заданному е.");

        double e= 0.001;
        double a;
        double sum=0;
        System.out.println("При е = "+e);
        for(int i=1;i<1000;i++){
         a=Math.pow(2,-i)+Math.pow(3,-i);
            if(a>=e){
                System.out.print(a+" ");
                sum+=a;
            }
        }
        System.out.println("\nсумма = "+sum);
    }
    public static void task17(){
        System.out.println("6. Вывести на экран соответствий между символами и их численными" +
                " обозначениями в памяти компьютера.");
        System.out.println("Выводим стандартную таблицу символов ASCII");
        for (int i = 32; i <= 127; i++) {//всего в ASCII 256 кодов. От 32 до 127 это
            // буквы, цифры, знаки препинания и другие символы расположенные на англ. клавиатуре
            System.out.println(i + " " + (char) i);
        }

    }
    public static void task18(){
        System.out.println("7. Для каждого натурального числа в промежутке от m до n вывести все делители," +
                " кроме единицы и самого числа. m и n вводятся с клавиатуры.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m:");
        int m = Integer.parseInt(scanner.next());
        System.out.println("Введите число n:");
        int n = Integer.parseInt(scanner.next());
        for (int i =m;i<=n;i++){
            System.out.println("Делители числа "+i);
            for(int j=2;j<i;j++){
                if(i%j==0){
                    System.out.print(j+"; ");
                }
            }
            System.out.println();
        }
    }
    public static void task19(){
        System.out.println("8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");

        int a = 567121245;
        int b=561212456;
        int c,t,p;
        System.out.println("a = "+a+" b = "+b+"\nОбщие цифры:");

        while (a>0){
            c=a%10;
            a=a/10;
            p=a;
            while (p>0){
                t=p%10;
                if(t==c){
                    c=a%10;
                    a=a/10;
                    p=a;
                }
                p=p/10;
            }
            p=b;
            while (p>0){
                t=p%10;
                if(t==c){
                    System.out.print(c+"; ");
                    break;
                }
                p=p/10;
            }

        }
        System.out.println();
    }
}

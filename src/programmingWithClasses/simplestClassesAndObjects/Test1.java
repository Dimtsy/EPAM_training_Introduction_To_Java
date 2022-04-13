package programmingWithClasses.simplestClassesAndObjects;
//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {
    private int a;
    private int b;

    public static int sumAb(int a, int b) {

        return a+b;
    }
    public static int maxAb(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void outPut(int a) {
        System.out.println(a);
    }
}

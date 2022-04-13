package algorithmization.decomposition;

import static java.lang.Math.sqrt;

public class Task9 {
    public static void task9() {
        System.out.println("9. Даны числа X, Y, Z, Т — длины сторон четырехугольника." +
                " Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой");

        int x=5;
        int y=6;
        int z=7;
        int t=8;

        double s1= 0.5*x*y;//находим площать треугольника с прямым углом

        double d =sqrt(x*x+y*y);//находим диагональ

        double p =(d+z+t)/2;//находим полупириметр второго треугольника

        double s2= sqrt(p*(p-d)*(p-z)*(p-t));//находим площадь второго треугольника

        double s = s1+s2;//находим площадь всего четырехугольника

        System.out.println("X = "+x+"; Y = "+y+"; Z = "+z+"; T = "+t+"\n Площадь четырехугольника:\n S = "+s);

    }
}

package programmingWithClasses.simplestClassesAndObjects;
//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.
public class Triangle {
    private int ax,ay,bx,by,cx,cy;

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3,4,5,1);
        System.out.println(triangle.a()+" "+triangle.b()+" "+triangle.c());
        System.out.println("Периметр: "+triangle.perimeter()+" Площадь: "+triangle.square());
        triangle.medianIntersections();
    }

    public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
    }

    public void medianIntersections(){
    double xA1=(ax+bx)/2;
    double yA1=(ay+by)/2;
    double xM= (ax+2*xA1)/3;
    double yM = (ay+2*yA1)/3;
    System.out.println("Точка пересечения медиан М("+xM+":"+yM+")");
}
    public double square(){
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a()) * (halfPerimeter - b()) * (halfPerimeter - c()));
    }
    public double perimeter(){
        return a()+b()+c();
    }
    public double a(){
        return Math.sqrt((bx-ax)*(bx-ax)+(by-ay)*(by-ay));
    }
    public double b(){
        return Math.sqrt((cx-bx)*(cx-bx)+(cy-by)*(cy-by));
    }
    public double c(){
        return Math.sqrt((ax-cx)*(ax-cx)+(ay-cy)*(ay-cy));
    }
}

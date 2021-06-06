package ru.swt.my;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Olga");

        Square s = new Square(7);
        Rectangle r = new Rectangle(11,12);

        Point point1 = new Point(-10, -16);
        Point point2 = new Point(2, 8);

        System.out.println("Расстояние между двумя точками: "
                + "[" + point1.x + ", " + point1.y + "], [" + point2.x + ", " + point2.y + "]" +
                " равно " + distance(point1, point2));

        System.out.println("Расстояние между двумя точками: "
                + "[" + point1.x + ", " + point1.y + "], [" + point2.x + ", " + point2.y + "]" +
                " равно " + point1.distance(point2));


        System.out.println("Площадь квадрата со стороной " + s.l + " = " +  area(s));
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area (r));

    }

    public static int myFunction(int a, int b) {
        return a+b;
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area (Square s) {
        return s.l*s.l;
    }

    public static double area (Rectangle r) {
        return r.a * r.b;
    }

    public static double distance(Point start, Point end) {
        return Math.sqrt(
                (end.x - start.x) * (end.x - start.x) +
                        (end.y - start.y) * (end.y - start.y)
        );
    }

    Square s = new Square(7);
    Rectangle r = new Rectangle(11,12);


}

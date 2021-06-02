package ru.swt.my;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Olga");

        Point point1 = new Point(2, 6);
        Point point2 = new Point(40, 30);

        System.out.println("Расстояние между двумя точками: "
                + "[" + point1.x + ", " + point1.y + "], [" + point2.x + ", " + point2.y + "]" +
                " равно " + distance(point1, point2));

        System.out.println("Расстояние между двумя точками: "
                + "[" + point1.x + ", " + point1.y + "], [" + point2.x + ", " + point2.y + "]" +
                " равно " + point1.distance(point2));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double distance(Point start, Point end) {
        return Math.sqrt(
                (end.x - start.x) * (end.x - start.x) +
                        (end.y - start.y) * (end.y - start.y)
        );
    }

}
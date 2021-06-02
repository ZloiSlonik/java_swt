package ru.swt.my;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(
                (point.x - x) * (point.x - x) +
                        (point.y - y) * (point.y - y)
        );
    }
}

package ru.swt.my;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello("Olga");

        double start1 = 2;
        double end1 = 6;
        double start2 = 40;
        double end2 = 30;

        System.out.println(Math.sqrt(9));

        System.out.println("Расстояние между двумя точками с координатами " + start1 + "," + end1 + " и " + start2 + "," + end2 + " равно " + Math.sqrt(distance(start1, start2, end1, end2)));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double distance(double start1, double start2, double end1, double end2) {

        return (start2-start1)*(start2-start1)+(end2-end1)*(end2-end1);
    }

}
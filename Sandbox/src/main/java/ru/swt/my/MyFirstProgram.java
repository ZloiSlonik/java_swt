package ru.swt.my;

public class MyFirstProgram {

    public static void main(String[] args) {
       hello("Lara");
        hello("Olga");
        hello("Bubu");
        double len = 6;
        double a = 8;
        double b = 7;
        System.out.println("Площадь квардарат со стороной " + len + "=" +  area(len));
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area (a,b));

    }

    public static int myFunction(int a, int b) {
        return a+b;
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double l) {
        return l*l;
    }

    public static double area (double a, double b) {
        return a*b;
    }

}
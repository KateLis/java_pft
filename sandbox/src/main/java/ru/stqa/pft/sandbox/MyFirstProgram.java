package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
       hello("Kate");

       double len = 6;
       System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

       double ava = 5;
       double beta = 7;
       System.out.println("Площадь прямоугольника со сторонами " + ava + " и " + beta + " = " + area(ava, beta));
    }

	public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l){
	    return l*l;
    }

    public static double area(double a, double b) {
	    return a * b;
    }
}
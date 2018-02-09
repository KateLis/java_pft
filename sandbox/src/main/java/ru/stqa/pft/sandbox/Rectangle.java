package ru.stqa.pft.sandbox;

public class Rectangle {

    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //ниже убирали параметр в (), потому что ссылка на объект будет доступна по ключевому слову this
    public double area() {
        return this.a * this.b;
    }
}

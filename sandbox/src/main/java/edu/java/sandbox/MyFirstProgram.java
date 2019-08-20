package edu.java.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");

    Square s = new Square(5);

    Rectangle a = new Rectangle(4,6);

    System.out.println("Площать квадрата со стороной L=" + s.l + " равна " + s.area());
    System.out.println("Площать прямоугольника со сторонами " + a.a + " и " + a.b + " равна " + a.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }




}
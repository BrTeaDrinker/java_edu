package edu.java.sandbox;

public class CallCalculation {

  public static void main(String[] args) {
    Point a = new Point(4,2);
    Point b = new Point (7, -2);

    System.out.println("Точка 1 с координатами: (" + a.dotA + "; " + a.dotB +")");
    System.out.println("Точка 2 с координатами: (" + b.dotA + "; " + b.dotB +")");
    System.out.println("расстояние между точками равно: " + a.distance(a,b));
  }
  /*public static double distance(Point a, Point b){
    return (Math.sqrt(Math.pow((a.dotA-b.dotA),2) + Math.pow((a.dotB-b.dotB),2)));
  }*/
}

package edu.java.sandbox;

public class Point {

  public int dotA, dotB;
  public Point(int dotA, int dotB){
    this.dotA = dotA;
    this.dotB = dotB;
  }

  public double distance(Point a, Point b){
    return (Math.sqrt(Math.pow((a.dotA-b.dotA),2) + Math.pow((a.dotB-b.dotB),2)));
  }
  }

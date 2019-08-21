package edu.java.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void TestDistance(){
    Point a = new Point(1,16);
    Point b = new Point (4,12);

    Assert.assertEquals(b.distance(a,b),5);
  }
}

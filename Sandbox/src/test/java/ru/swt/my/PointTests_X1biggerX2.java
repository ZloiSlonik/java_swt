package ru.swt.my;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_X1biggerX2 {

    @Test
    public void testDistance() {
        Point point1 = new Point(10, 16);
        Point point2 = new Point(2, 8);
        Assert.assertEquals(point1.distance(point2),11.313708498984761);


    }
}

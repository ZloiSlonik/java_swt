package ru.swt.my;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_zero {

    @Test
    public void testDistance() {
        Point point1 = new Point(10, 16);
        Point point2 = new Point(10, 16);
        Assert.assertEquals(point1.distance(point2),0);


    }
}

package ru.swt.my;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_negativeValue {

    @Test
    public void testDistance() {
        Point point1 = new Point(-10, -16);
        Point point2 = new Point(2, 8);
        Assert.assertEquals(point1.distance(point2),26.832815729997478);


    }
}

package ru.swt.my;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_negative {

    @Test
        public void testDistance() {
        Point point1 = new Point(2, 6);
        Point point2 = new Point(40, 30);
        Assert.assertEquals(point1.distance(point2),20);


    }
}

package ru.stqa.gsa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoint_1() {
        MPoint m = new MPoint(-1,2,1,2);
        Assert.assertEquals(m.distance(),3.1622776601683795);
    }

    @Test
    public void testPoint_2() {
        MPoint m = new MPoint(-1,2,1,2);
        assert(m.distance()!= 0): "Выражение равно нулю";
    }

    @Test
    public void testPoint_3() {
        MPoint m = new MPoint(-1,2,1,2);
        assert(m.distance()> 0): "Выражение меньше нуля";
    }

}

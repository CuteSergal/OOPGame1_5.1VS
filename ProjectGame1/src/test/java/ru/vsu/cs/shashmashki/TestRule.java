package ru.vsu.cs.shashmashki;

import org.junit.Assert;
import org.junit.Test;

public class TestRule {

    @Test
    public void testRegularCanMoveBackward() {
        Rule r= Rule.regular;
        Assert.assertFalse(r.isCanBackwards());
    }

}

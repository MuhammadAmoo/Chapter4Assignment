package com;

import Inheritance.UnderGraduate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InheritP2Test {

    private UnderGraduate graduate;

    @Before
    public void setUp() throws Exception {
        graduate = new UnderGraduate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        String test = graduate.toString();
        Assert.assertNotNull(test);
    }
}
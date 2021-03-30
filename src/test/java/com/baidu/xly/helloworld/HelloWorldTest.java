package com.baidu.xly.helloworld;

import junit.framework.Test;
import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String ss = hw.testMethod1();
        assertNotNull(ss);
    }

    public void testDivid() {
        HelloWorld hw = new HelloWorld();
        int ss = hw.divid(6, 3);
        assertEquals(ss, 2);
    }

    public void testScore() {
        HelloWorld hw = new HelloWorld();
        String s = hw.printScore(90);
        assertEquals(s, "A");
    }

}

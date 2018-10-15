package com.test.JacocoUnitDemo;

import junit.framework.TestCase;
import com.test.JacocoUnitDemo.HelloWord;

/**
 * Unit test for simple App.
 */
public class HelloWordTest extends TestCase {
    public void testMethod1() {
        HelloWord hw = new HelloWord();
        String ss = hw.testMethod1();
        assertNotNull(ss);
    }

    public void testScore() {
        HelloWord hw = new HelloWord();
        String flag = hw.score(89);
        assertEquals(flag, "B");
    }

}

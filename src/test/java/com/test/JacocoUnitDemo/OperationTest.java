package com.test.JacocoUnitDemo;

import junit.framework.TestCase;

import com.test.JacocoUnitDemo.Operation;

public class OperationTest extends TestCase {

    public void testMultiple() {
        Operation op = new Operation();
        int a = op.multiple(2, 3);
        assertEquals(a, 6);
    }

    public void testGetRank() {
        Operation op = new Operation();
        assertEquals("相等", "A", op.getRank(85));
    }
}

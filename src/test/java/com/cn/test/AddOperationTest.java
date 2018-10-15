package com.cn.test;

import junit.framework.TestCase;

import com.cn.test.AddOperation;

public class AddOperationTest extends TestCase {

    public void testAdd() {
        AddOperation ao = new AddOperation();
        int a = ao.add(3, 4);
        assertEquals(a, 7);
    }

    public void testDivid() {
        AddOperation ao = new AddOperation();
        int c = ao.divid(6, 2);
        assertEquals(c, 3);
    }

    public void testSquart() {
        AddOperation ao = new AddOperation();
        int c = ao.squart(2);
        assertEquals(c, 4);
    }
}

package com.pax8.rate

class TestClassTest extends GroovyTestCase {
    void test1() {
        TestClass p = new TestClass()
        assertEquals(1.0, p.usedMethod())
    }

    void test2() {
        TestClass p = new TestClass()
        p.unrelatedMethod()
    }
}

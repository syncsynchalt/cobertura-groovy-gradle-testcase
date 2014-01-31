package com.pax8.rate

public class TestClass {
    // comment out this method to fix coverage
    public BigDecimal unusedMethod() {
        return usedMethod()
    }

    public BigDecimal usedMethod() {
        println 'Definitely reached!'
        1.0
    }

    public void unrelatedMethod() {
        println 'Unrelated method also reached'
    }
}

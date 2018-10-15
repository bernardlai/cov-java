package com.test.JacocoUnitDemo;

/**
 * Hello world!
 *
 */
public class HelloWord {
    public HelloWord() {

    }

    public String testMethod1() {
        return "Hello world!";
    }

    public int addMethod(int a, int b) {
        return a + b;
    }

    public int subMethod(int a, int b) {
        return a - b;
    }

    public int divid(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public String score(int s) {
        if (s < 60) {
            return "D";
        } else if (s < 70) {
            return "C";
        } else if (s < 90) {
            return "B";
        } else {
            return "A";
        }
    }

}

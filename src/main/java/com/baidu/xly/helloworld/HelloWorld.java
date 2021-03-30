package com.baidu.xly.helloworld;

/**
 * Hello world!
 *
 */
public class HelloWorld {
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

    public String printScore(int i) {
        if (i > 0 && i < 60) {
            return "D";
        } else {
            return "A";
        }
    }
}

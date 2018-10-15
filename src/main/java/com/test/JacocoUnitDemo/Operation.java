package com.test.JacocoUnitDemo;

public class Operation {

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divid(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public String getRank(int a) {
        if (a >= 0 && a < 60) {
            return "C";
        } else if (a >= 60 && a < 80) {
            return "B";
        } else if (a >= 80 && a < 90) {
            return "A";
        } else {
            return "A+";
        }
    }

    public int sqar(int a) {
        if (a == 0) {
            return 0;
        }
        return a * a;
    }

    public int add(int a, int b) {
        return a + b;
    }
}

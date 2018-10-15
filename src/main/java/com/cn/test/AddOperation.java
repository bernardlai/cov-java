package com.cn.test;

public class AddOperation {
    public int add(int x, int y) {
        return x + y;
    }

    public String printContent(String s) {
        return "----" + s + "-------";
    }

    public String printScore(int i) {
        if (i > 0 && i < 60) {
            return "D";
        } else {
            return "A";
        }
    }

    public int divid(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public int squart(int a) {
        if (a == 0) {
            return 0;
        }
        return a * a;
    }
}

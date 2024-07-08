package com.robie.sobie.testing.calculator;

public class Calculator {
    private int a,b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a + b;
    }
    public int substrat(){
        return a-b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

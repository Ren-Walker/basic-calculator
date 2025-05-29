package io.github;

public class Multiplication {

    private float a;
    private float b;
    private float result;
    private String operation;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a * b;
        this.operation = "Multiplication";
    }

    public float getResult() {
        System.out.println("Performing " + operation + ": " + a + " * " + b + " = " + result);
        return result;
    }
    
}

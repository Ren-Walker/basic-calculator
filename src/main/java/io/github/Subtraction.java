package io.github;

public class Subtraction {

    private float a;
    private float b;
    private float result;
    private String operation;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a - b;
        this.operation = "Subtraction";
    }

    public float getResult() {
        System.out.println("Performing " + operation + ": " + a + " - " + b + " = " + result);
        return result;
    }
    
}

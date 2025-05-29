package io.github;

public class Division {

    private float a;
    private float b;
    private float result;
    private String operation;

    public Division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        this.a = a;
        this.b = b;
        this.result = a / b;
        this.operation = "Division";
    }

    public float getResult() {
        System.out.println("Performing " + operation + ": " + a + " / " + b + " = " + result);
        return result;
    }
    
}

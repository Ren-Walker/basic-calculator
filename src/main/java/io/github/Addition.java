package io.github;

public class Addition {
    
    private float a;
    private float b;
    private float result;
    private String operation;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = a + b;
        this.operation = "Addition";
    }

    public float getResult() {
        System.out.println( "Performing " + operation + ": " + a + " + " + b + " = " + result );

        return result;
    }


}

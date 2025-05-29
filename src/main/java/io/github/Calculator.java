package io.github;

public class Calculator {
    
    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;
    private float result;
    private float a;
    private float b;
    private String operation;
    
    public Calculator(float a, float b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;

        switch (operation.toLowerCase()) {
            case "addition":
                this.addition = new Addition((int) a, (int) b);
                this.result = addition.getResult();
                break;
            case "subtraction":
                this.subtraction = new Subtraction((int) a, (int) b);
                this.result = subtraction.getResult();
                break;
            case "multiplication":
                this.multiplication = new Multiplication((int) a, (int) b);
                this.result = multiplication.getResult();
                break;
            case "division":
                this.division = new Division((int) a, (int) b);
                this.result = division.getResult();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    public float getResult() {
        System.out.println("Result of " + operation + " operation: " + result);
        System.out.println();
        return result;

    }

}

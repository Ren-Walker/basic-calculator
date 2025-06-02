package io.github;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static final Map<String, Arithmetic> operations = new HashMap<>();

    static {
        operations.put("addition", new Addition());
        operations.put("subtraction", new Subtraction());
        operations.put("multiplication", new Multiplication());
        operations.put("division", new Division());
        operations.put("exponentiation", new Exponentiation());
        operations.put("modulus", new Modulus());
    }

    private final float result;

    public Calculator(float a, float b, String operation) {
        Arithmetic arithmeticOp = operations.get(operation.toLowerCase());
        if (arithmeticOp == null) {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        this.result = arithmeticOp.calculate(a, b);
    }

    public float getResult() {
        return result;
    }
}
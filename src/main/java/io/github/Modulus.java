package io.github;

public class Modulus implements Arithmetic {

    @Override
    public float calculate(float a, float b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        
        return a % b;
    }
}
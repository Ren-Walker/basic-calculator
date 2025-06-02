package io.github;

public class Exponentiation implements Arithmetic {

    @Override
    public float calculate(float base, float exponent) {
        if (base == 0 && exponent <= 0) {
            throw new IllegalArgumentException("Base cannot be zero when exponent is zero or negative.");
        }
        
        return (float) Math.pow(base, exponent);

    }
    
}

package com.tdd.tddlab.converters;

public class PrimeFactors {

    public int[] findPrimeFactorsFor(int number) {
        if(number > 1) return new int[] { number };

        return new int[0];
    }
}

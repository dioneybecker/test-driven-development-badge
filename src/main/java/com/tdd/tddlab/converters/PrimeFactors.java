package com.tdd.tddlab.converters;

import java.util.ArrayList;

public class PrimeFactors {

    public int[] findPrimeFactorsFor(int factor) {
        var primeFactors = new ArrayList<Integer>();
        if(factor > 1) {
            if(factor % 2 == 0){
                primeFactors.add(2);
                factor /= 2;
            }
            if(factor > 1) primeFactors.add(factor);
        }

        return primeFactors.stream().mapToInt(Integer::intValue).toArray();
    }
}

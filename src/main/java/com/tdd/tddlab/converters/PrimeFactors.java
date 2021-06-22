package com.tdd.tddlab.converters;

import java.util.ArrayList;

public class PrimeFactors {

    public int[] findPrimeFactorsFor(int factor) {
        var primeFactors = new ArrayList<Integer>();
        for (var divisor = 2; factor > 1; divisor++) {
            for (; factor % divisor == 0; factor /= divisor)
                primeFactors.add(divisor);
        }

        return primeFactors.stream().mapToInt(Integer::intValue).toArray();
    }
}

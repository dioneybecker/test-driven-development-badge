package com.tdd.tddlab;

import com.tdd.tddlab.converters.PrimeFactors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeFactorsTest {

    PrimeFactors primeFactors;

    @Test
    void canary(){
        assertEquals(true, true);
    }

    @Nested
    @DisplayName(value = "A prime numbers function should")
    class PrimeFactorsTestNested {

        @BeforeEach
        void _initialize(){
            primeFactors = new PrimeFactors();
        }

        @Test
        @DisplayName(value = "for 1 return []")
        void test1(){
            assertTrue(Arrays.equals(primeFactors.findPrimeFactorsFor(1), new int[0]));
        }

        @Test
        @DisplayName(value = "for 2 return [2]")
        void test2(){
            assertTrue(Arrays.equals(primeFactors.findPrimeFactorsFor(2), new int[] { 2 }));
        }
        // TODO: for 2 return [2]
        // TODO: for 3 return [3]
        // TODO: for 4 return [2, 2]
    }
}

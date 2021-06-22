package com.tdd.tddlab;

import com.tdd.tddlab.converters.PrimeFactors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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
            assertArrayEquals(new int[0], primeFactors.findPrimeFactorsFor(1));
        }

        @Test
        @DisplayName(value = "for 2 return [2]")
        void test2(){
            assertArrayEquals(new int[] { 2 }, primeFactors.findPrimeFactorsFor(2));
        }
        @Test
        @DisplayName(value = "for 3 return [3]")
        void test3(){
            assertArrayEquals(new int[] { 3 }, primeFactors.findPrimeFactorsFor(3));
        }

        //for 4 return [2, 2]
        @Test
        @DisplayName(value = "for 4 return [2,2]")
        void test4(){
            assertArrayEquals(new int[] { 2, 2 }, primeFactors.findPrimeFactorsFor(4));
        }

        // for 5 return [5]
        @Test
        @DisplayName(value = "for 5 return [5]")
        void test5(){
            assertArrayEquals(new int[] { 5 }, primeFactors.findPrimeFactorsFor(5));
        }

        // for 6 return [2,3]
        @Test
        @DisplayName(value = "for 6 return [2,3]")
        void test6(){
            assertArrayEquals(new int[] { 2,3 }, primeFactors.findPrimeFactorsFor(6));
        }

        // for 7 return [7]
        @Test
        @DisplayName(value = "for 7 return [7]")
        void test7(){
            assertArrayEquals(new int[] { 7 }, primeFactors.findPrimeFactorsFor(7));
        }

        @Test
        @DisplayName(value = "for 8 return [2,2,2]")
        void test8(){
            assertArrayEquals(new int[] { 2, 2, 2 }, primeFactors.findPrimeFactorsFor(8));
        }

        @Test
        @DisplayName(value = "for 9 return [3,3]")
        void test9(){
            assertArrayEquals(new int[] { 3,3 }, primeFactors.findPrimeFactorsFor(9));
        }

        @Test
        @DisplayName(value = "for 25 return [5,5]")
        void test10(){
            assertArrayEquals(new int[] { 5,5 }, primeFactors.findPrimeFactorsFor(25));
        }

        @Test
        @DisplayName(value = "for 864 return [2,2,2,2,2,3,3,3]")
        void test11(){
            assertArrayEquals(new int[] { 2,2,2,2,2,3,3,3 }, primeFactors.findPrimeFactorsFor(864));
        }
    }
}

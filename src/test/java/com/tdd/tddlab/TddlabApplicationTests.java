package com.tdd.tddlab;

import com.tdd.tddlab.converters.Converter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//@SpringBootTest
class TddlabApplicationTests {

    Converter converter;

    @DisplayName(value = "canary test")
    @Test
    void contextLoads() {
        //assertEquals(true, true);
    }

    @Nested
    @DisplayName(value = "Test Palindrome")
    class palindrome {

        @BeforeEach
        void _initialize() {
            converter = new Converter();
        }

        @Test
        @DisplayName(value = "test for arara")
        void test_palindromes() {
            assertEquals(true, converter.isPalindrome("arara"));
        }

        @Test
        @DisplayName(value = "true for mom")
        void mom() {
            assertEquals(true, converter.isPalindrome("mom"));
        }

        @Test
        @DisplayName(value = "false for dude")
        void dude() {
            assertEquals(false, converter.isPalindrome("dude"));
        }

        @Test
        @DisplayName(value = "true for mom mom")
        void mom_mom() {
            assertEquals(true, converter.isPalindrome("mom mom"));
        }

        @Test
        @DisplayName(value = "false for dad mom")
        void dad_mom() {
            assertEquals(false, converter.isPalindrome("dad mom"));
        }

        @Test
        @DisplayName(value = "throws exception for whitespace")
        void whitespace() {
            assertThrows(InvalidParameterException.class, () -> converter.isPalindrome("    "));
        }

        @Test
        @DisplayName(value = "throws exception for empty string")
        void empty_string() {
            assertThrows(InvalidParameterException.class, () -> converter.isPalindrome(""));
        }
    }


    @Nested
    @DisplayName(value = "fahrenheit to celsius converter behaves as follows")
    class fahrenheitToCelsius {

        @BeforeEach
        void _initialize() {
            converter = new Converter();
        }

        @Test
        @DisplayName(value = "212 degrees fahrenheit is 100 degrees celius")
        void convert_Fahrenheit_To_Celsius_212_to_100() {
            assertEquals(100, converter.fahrenheit2Celsius(212));
        }

        @Test
        @DisplayName(value = "32 degrees fahrenheit is 0 degrees celius")
        void convert_Fahrenheit_To_Celsius_32_to_0() {
            assertEquals(0, converter.fahrenheit2Celsius(32));
        }

        @Test
        @DisplayName(value = "50 degrees fahrenheit is 10 degrees celius")
        void convert_Fahrenheit_To_Celsius_50_to_10() {
            assertEquals(10, converter.fahrenheit2Celsius(50));
        }

        @Test
        @DisplayName(value = "-22 degrees fahrenheit is -30 degrees celius")
        void convert_Fahrenheit_To_Celsius_minus22_to_minus30() {
            assertEquals(-30, converter.fahrenheit2Celsius(-22));
        }
    }

}

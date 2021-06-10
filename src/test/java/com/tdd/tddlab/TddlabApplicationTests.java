package com.tdd.tddlab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@SpringBootTest
class TddlabApplicationTests {

	@DisplayName(value = "canary test")
	@Test
	void contextLoads() {
		assertEquals(true, true);
	}

	@Nested
	@DisplayName(value = "fahrenheit to celsius converter behaves as follows")
	class fahrenheitToCelsius {

		@Test
		@DisplayName(value = "212 degrees fahrenheit is 100 degrees celius")
		void convert_Fahrenheit_To_Celsius_212_to_100() {
			assertEquals(fahrenheit2Celsius(212), 100);
		}

		@Test
		@DisplayName(value = "32 degrees fahrenheit is 0 degrees celius")
		void convert_Fahrenheit_To_Celsius_32_to_0() {
		}

		@Test
		@DisplayName(value = "50 degrees fahrenheit is 10 degrees celius")
		void convert_Fahrenheit_To_Celsius_50_to_10() {
		}
	}

	private int fahrenheit2Celsius(int fahrenheit) {
		return 100;
	}
}

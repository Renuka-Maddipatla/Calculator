package com.aslinformationservices.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void testAdd() {
		double ans = calculator.add(2.5, 2.2);
		assertEquals(4.7, ans);
	}

	@Test
	void testSubtract() {
		double ans = calculator.subtract(2.5, 2);
		assertEquals(0.5, ans);
	}

	@Test
	void testMultiply() {
		double ans = calculator.multiply(2.0, 2.0);
		assertEquals(4.0, ans);
	}

	@Test
	void testDivide() {
		double ans = calculator.divide(4.0, 2.0);
		assertEquals(2.0, ans);
	}

}
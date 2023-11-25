package com.aslinformationservices.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomFeatureTest {

	CustomFeature customFeature;

	@BeforeEach
	void setUp() {
		customFeature = new CustomFeature();
	}

	@Test
	void testMean() {
		double mean = customFeature.calculateMean(2.0, 6.0, 8.0, 7.0);
		assertEquals(5.75, mean);
	}

}

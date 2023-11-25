package com.aslinformationservices.calculator;

public class CustomFeature {

	public double calculateMean(double... numbers) {
		if (numbers.length == 0) {
			throw new IllegalArgumentException("numbers should not empty");
		}

		double sum = 0;

		for (double num : numbers) {
			sum += num;
		}
		double mean = sum / numbers.length;
		return mean;
	}
}
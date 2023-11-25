package com.aslinformationservices.calculator;

public class EquationSolver {

	public double solveLinearEquation(double a, double b, double c) {
		if (a == 0) {
			throw new IllegalArgumentException();
		}
		double ans = (c - b) / a;
		return ans;
	}
}
package com.aslinformationservices.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquationSolverTest {

	EquationSolver equationSolver;

	@BeforeEach
	void setUp() {
		equationSolver = new EquationSolver();
	}

	@Test
	void testForSolveLinearEquation() {
		double ans = equationSolver.solveLinearEquation(2.0, 3.0, 5.0);
		assertEquals(1.0, ans);
	}
}

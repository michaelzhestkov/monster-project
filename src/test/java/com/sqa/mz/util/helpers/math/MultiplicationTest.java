/**
 *   File Name: MyMathTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.mz.util.helpers.math;

import java.util.*;

import org.testng.*;
import org.testng.annotations.*;

import com.sqa.mz.util.helpers.*;

public class MultiplicationTest {

	@DataProvider
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 2.0 }, 4.0 }, { new double[] { 5.0, 2.0, 2.0, 3.0 }, 60.0 } };
		return data;

	}

	@Test(dataProvider = "getData")
	public void testMultiplication(double[] numbers, double expectedResult) {
		double actualResult;
		actualResult = MyMath.multNumbers(numbers);
		String numberString = Arrays.toString(numbers);
		String errorMessage = String.format("Error: The result of multiplying %s is actually %.0f, not expected",
				numberString, actualResult);
		String message = String.format("The result of multiplying %s is actually %.0f", numberString, actualResult);
		// System.out.println(message);
		Assert.assertEquals(actualResult, expectedResult, 0, message);
	}
}
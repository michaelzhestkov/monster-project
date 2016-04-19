package com.sqa.mz.util.helpers.math;

import org.testng.*;
import org.testng.annotations.*;

import com.sqa.mz.util.helpers.*;

/**
 * MyMathTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Zhestkov, Michael
 * @version 1.0.0
 * @since 1.0
 *
 */

public class DivisionTest {

	@DataProvider(name = "getData")
	public static Object[][] getData() {
		Object[][] data = { { 4.0, 2.0, 2.0 }, { 6.0, 2.0, 3.0 }, { 12.0, 4.0, 3.0 }, { 100.0, 50.0, 2.0 } };
		return data;
	}

	@Test(dataProvider = "getData")
	public void testDivideNumbers(double num1, double num2, double expectedResult) {
		double actualResult;
		actualResult = MyMath.divideNumbers(num1, num2);
		String message = String.format("The result of %.0f devided by %.0f is %.0f", num1, num2, actualResult);
		System.out.println(message);
		Assert.assertEquals(actualResult, expectedResult, 0, message);
	}

}

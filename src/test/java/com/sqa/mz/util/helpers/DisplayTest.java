/**
 *   File Name: DisplayTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.mz.util.helpers;

import org.testng.annotations.*;

/**
 * DisplayTest //ADDD (description of class)
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
public class DisplayTest {

	private static String appName = "SQA";
	private static String userName = "User";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userName = AppBasics.welcomeUser(appName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		AppBasics.fairwellUser(userName, appName);
	}

	@Test
	public void adisplay2DArray1() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 11, 22, 33, 44 }, { 111, 222, 333, 444, 555 } };
		matrix = Display.display2DArray(matrix);
	}

	@Test
	public void displayArrayTest1() {
		int array[] = { 1, 2, 3, 4, 5 };
		array = Display.displayArray(array);
	}

}

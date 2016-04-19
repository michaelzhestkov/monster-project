/**
 *   File Name: RequestInputTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.mz.util.helpers;

import java.util.*;

import org.testng.annotations.*;

public class RequestInputTest {
	private static String question;
	static private Scanner scanner;
	private static String userName;
	static private Object userValue;

	/**
	 * @param question
	 * @param userValue
	 */
	@AfterClass
	public static void displayOutput() {
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");

	}

	/**
	 *
	 */
	@AfterClass
	public static void farewellUser() {
		System.out.println("Thank you, " + userName + ", for executing my test");

	}

	/**
	 *
	 */
	@BeforeClass
	public static void welcomeUser() {
		System.out.println("Welcome to my Request Input Tests");
		System.out.println("Could you please provide me with your name?");
		scanner = new Scanner(System.in);
		userName = scanner.nextLine();

	}

	@BeforeMethod
	public void clear() {
		userName = "";
		question = "";

	}

	/**
	 * Test method for
	 * {@link com.sqa.mz.util.helpers.RequestInput#getChar(java.lang.String)}.
	 */
	@Test
	public void testGetCharString() {
		// welcomeUser();
		question = "Please, give me your char";
		userValue = RequestInput.getChar(question, 'A', 'a', 'B', 'b');
		// displayOutput(question, userValue);
		// farewellUser();

	}

	/**
	 * Test method for
	 * {@link com.sqa.mz.util.helpers.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test(enabled = false)
	public void testGetCharStringCharArray() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.mz.util.helpers.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	public void testGetDouble() {
		// welcomeUser();
		question = "Please, give me your lucky double?";
		userValue = RequestInput.getDouble(question, 1.0, 2.0);
		// displayOutput(question, userValue);
		// farewellUser();

	}

	/**
	 * Test method for
	 * {@link com.sqa.mz.util.helpers.RequestInput#getInt(java.lang.String, int[])}
	 * .
	 */
	@Test
	public void testGetInt() {
		// welcomeUser();
		question = "Please, give me your lucky number?";
		userValue = RequestInput.getInt(question, 1, 2, 3, 4, 5, 6, 7);
		// displayOutput(question, userValue);
		// farewellUser();

	}

	@Test
	public void testGetIntWithRange() {
		// welcomeUser();
		question = "Please, provide me with a number in a selected range?";
		userValue = RequestInput.getIntWithRange(question, 1, 3);
		// displayOutput(question, userValue);
		// farewellUser();

	}

	@Test
	public void testGetRandomNumber() {
		// welcomeUser();
		question = "Please provide with a range for your Random number?";
		userValue = RequestInput.getRandomNumber(question);
		System.out.println("Random number is " + userValue);
		// displayOutput(question, userValue);
		// farewellUser();

	}

	/**
	 * Test method for
	 * {@link com.sqa.mz.util.helpers.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetString() {
		// welcomeUser();
		question = "Please, give me your favorite color";
		userValue = RequestInput.getString(question, "red", "white", "blue");
		// displayOutput(question, userValue);
		// farewellUser();

	}

}

/**
 *   File Name: AppBasicTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.mz.util.helpers;

import org.testng.annotations.*;

public class AppBasicTest {

	static String appName = "Test MZ Application";
	static String userName = "Michael";

	@Test
	public void aWelcomeUserTest() {
		userName = AppBasics.welcomeUser(appName);
	}

	@Test
	public void fairwellUserTest() {
		AppBasics.fairwellUser(userName, appName);
	}

}

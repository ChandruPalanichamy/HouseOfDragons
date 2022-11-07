package MavenExercise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exe_1 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("BEFORE TEST");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
	}

	@Test(priority = 3, enabled = true, description = "Run")

	public void delight() {
		System.out.println("Run Run");
	}

	@Test(priority = 3, enabled = false, description = "Run_add", dependsOnMethods = "delight")
	public void delight_add() {
		System.out.println("Run Add");
		int x = 5;
		int y = 10;
		System.out.println(x + y);

	}

	@Test(priority = 3, enabled = true, description = "Run", dependsOnMethods = "delight")

	public void delight_sub() {
		System.out.println("Run Run");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER METHOD");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AFTER TEST");
	}

}

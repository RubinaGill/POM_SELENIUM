package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import selenium.SeleniumDriver;

public class HomePageTest extends SeleniumDriver {
	@Test
	public void launch() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false, "check");
	}
}

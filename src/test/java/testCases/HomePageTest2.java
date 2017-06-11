package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import selenium.SeleniumDriver;

public class HomePageTest2 extends SeleniumDriver {
	@Test
	public void launch() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false, "\ncheck\n");
		
		System.out.println("launch executed by thread "+Thread.currentThread().getId());
		
	}

	@Test
	public void launch2() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck2\n");
		System.out.println("launch2 executed by thread "+Thread.currentThread().getId());
	}

	@Test
	public void launch3() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck3\n");
		System.out.println("launch3 executed by thread "+Thread.currentThread().getId());
	}

	@Test
	public void launch4() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck4\n");
		System.out.println("launch4 executed by thread "+Thread.currentThread().getId());
	}
}

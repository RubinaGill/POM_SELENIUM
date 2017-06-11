package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import selenium.SeleniumDriver;

public class HomePageTest extends SeleniumDriver {
	@Test
	public void launch11() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck11\n");
		System.out.println("launch executed by thread class 1 " + Thread.currentThread().getId());
	}

	@Test
	public void launch12() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck12\n");
		System.out.println("launch executed by thread " + Thread.currentThread().getId());
	}

	@Test
	public void launch13() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck13\n");
		System.out.println("launch executed by thread " + Thread.currentThread().getId());
	}

	@Test
	public void launch14() {
		driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true, "\ncheck14\n");
		System.out.println("launch executed by thread " + Thread.currentThread().getId());
	}
}

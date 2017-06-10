package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.ConfigReader;

public class SeleniumDriver {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void setUp() {
		// get chromeDriver filepath
		final File classpath = new File(System.getProperty(ConfigReader.getConfig("classpath")));
		final File exeDir = new File(classpath, ConfigReader.getConfig("exeDir"));
		final File chromeExe = new File(exeDir, (ConfigReader.getConfig("chromeExeName")));

		// set path of executable of chromeDriver
		System.setProperty("webdriver.chrome.driver", chromeExe.getAbsolutePath());

		// instantiate chrome driver
		driver = new ChromeDriver();

		// implicit wait for driver
		wait = new WebDriverWait(driver, 60);
	}

	@AfterTest
	public void tearDown() {
		// quit driver
		driver.quit();
	}
}

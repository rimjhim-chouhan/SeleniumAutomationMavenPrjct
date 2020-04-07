package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GooglesearchPage;

public class GooglesearchTest {

	private static WebDriver driver = null;

	@Test
	public void googlesearch() throws InterruptedException {
		GooglesearchPage.textbox_search(driver).sendKeys("Automation step by step");
		Thread.sleep(1000);
		GooglesearchPage.button_search(driver).click();
		Thread.sleep(5000);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rimjhim automation\\WebdriverTest\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}

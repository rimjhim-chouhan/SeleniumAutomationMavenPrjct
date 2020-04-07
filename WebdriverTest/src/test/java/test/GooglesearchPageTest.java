package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GooglesearchPageObjects;

public class GooglesearchPageTest {

	private static WebDriver driver = null;

	@BeforeTest
	public static void setupTest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rimjhim automation\\WebdriverTest\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public static void googlesearchtest() throws InterruptedException {

		GooglesearchPageObjects searchpageobj = new GooglesearchPageObjects(driver);
		driver.get("https://google.com");
		Thread.sleep(1000);
		searchpageobj.setTextInSearchBox("Automation step by step");
		Thread.sleep(5000);
		searchpageobj.clickSearchButtom();

	}

	@AfterTest
	public static void teardownTest() {
		driver.close();
		driver.quit();
		System.out.println("Suucessfully");
	}
}

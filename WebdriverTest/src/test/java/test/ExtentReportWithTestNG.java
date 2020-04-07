package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GooglesearchPageObjects;

public class ExtentReportWithTestNG {

	
	private static WebDriver driver = null;
	static ExtentHtmlReporter htmlreporter;
	static ExtentReports extent;
	
	static ExtentTest test1;
	
	@BeforeSuite
	public static void setup() {
		htmlreporter= new ExtentHtmlReporter("extentReportTng.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
		
	}
	
	@BeforeTest
	public static void setupTest() {
		
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability("ignoreProtectedModeSetting", true);
	
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rimjhim automation\\WebdriverTest\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(caps);
	}

	@Test
	public static void googlesearchtest1() throws InterruptedException {
		test1=extent.createTest("Google Search Engine", "This is for search google");
		
		GooglesearchPageObjects searchpageobj = new GooglesearchPageObjects(driver);
		
		driver.get("https://google.com");
		test1.log(Status.INFO,"Starting TC");
		Thread.sleep(1000);
		searchpageobj.setTextInSearchBox("Automation step by step");
		test1.pass("Enter text on search box");
		Thread.sleep(5000);
		searchpageobj.clickSearchButtom();
		test1.pass("Click on search button");

		
		test1.info("Test Completed");
	}
	
	@Test
	public static void googlesearchtest2() throws InterruptedException {
		test1=extent.createTest("Google Search Engine", "This is for search google");
		
		GooglesearchPageObjects searchpageobj = new GooglesearchPageObjects(driver);
		
		driver.get("https://google.com");
		test1.log(Status.INFO,"Starting TC");
		Thread.sleep(1000);
		searchpageobj.setTextInSearchBox("Automation step by step");
		test1.pass("Enter text on search box");
		Thread.sleep(5000);
		searchpageobj.clickSearchButtom();
		test1.pass("Click on search button");

		
		test1.info("Test Completed");
	}


	@AfterTest
	public static void teardownTest() {
		driver.close();
		test1.pass("Close the Broswer");
		//driver.quit();
		System.out.println("Suucessfully");
	}
	
	@AfterSuite
	public static void teardown() {

		
		extent.flush();
	}

	
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasic {
private static WebDriver driver=null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlreporter= new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest test1=extent.createTest("Google Search Engine", "This is for search google");
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Rimjhim automation\\WebdriverTest\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO,"Starting TC");
		
		driver.get("https://www.google.com/");
		test1.pass("Navigate to URL");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Enter text on search box");
		driver.findElement(By.name("btnK")).click();
		test1.pass("Click on search button");
		
		driver.close();
		test1.pass("Close the Broswer");
		
		test1.info("Test Completed");
		
		extent.flush();
		System.out.println("Execution compelted");
		
	}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglesearchPageObjects {

	WebDriver driver=null;
	By textbox_search= By.name("q");
	By button_search= By.name("btnK");
	
	public GooglesearchPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void setTextInSearchBox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButtom()
	{
		driver.findElement(button_search).click();
	}
}

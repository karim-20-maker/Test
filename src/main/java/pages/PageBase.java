package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
protected WebDriver driver;
public JavascriptExecutor jse ;

	// create constructor
	public PageBase(WebDriver driver)
	  {

		PageFactory.initElements(driver, this); // belongs to pom pattern; 

	}
	protected static void clickButton(WebElement button) {
		
		button.click();
		
	}
protected static void setText (WebElement textElements , String value) {
textElements.sendKeys(value);	
}

protected static void ClearButton(WebElement erase) {
	
	erase.clear();
	
}
public void scrollDown() {
	
	jse.executeScript("scrollBy(0,2500)");
	
	
}








}

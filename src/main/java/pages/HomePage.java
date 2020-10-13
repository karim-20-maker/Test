package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
@FindBy (xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
WebElement registerlink;

public void OpenRegisterationPage () {
	clickButton(registerlink);
}
@FindBy (linkText = "Log in")
WebElement LoginLink;


public void Openloginpage () {
	clickButton(LoginLink);
	
}


@FindBy(linkText = "Contact us")
WebElement contactUsLink ;


public void clickOnContactUs () {
	clickButton(contactUsLink);
}



}



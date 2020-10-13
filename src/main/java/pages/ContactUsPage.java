package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	

	
	@FindBy(id = "FullName")
	WebElement insertUrName ;
	
	@ FindBy(id = "Email")
	WebElement insertEmail;
	
	@FindBy(id = "Enquiry")
	WebElement youProblem ;
	
	@FindBy (css = "input.button-1.contact-us-button")
	WebElement submitBtn ;
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
	public WebElement SeccessMsg;
	
	
	
	public void contactUsMethod (String name , String email , String message) {
		
		setText(insertUrName, name);
		setText(insertEmail, email);
		setText(youProblem, message);
		clickButton(submitBtn);
		
	}

	
	
	
	
	
}

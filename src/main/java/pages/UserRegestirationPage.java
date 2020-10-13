package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegestirationPage extends PageBase {

	public UserRegestirationPage(WebDriver driver) {
		super(driver);

	}
	@FindBy (id = "gender-male")
	WebElement genderBotton;

	@FindBy (id = "FirstName")
	WebElement InsertYourName;

	@FindBy(id = "LastName")
	WebElement insertYourLastName;

	@FindBy(id = "Email")
	WebElement INsertYourValidEmail;

	@FindBy (id = "Password")
	WebElement INsertStrongPass;

	@FindBy (id = "ConfirmPassword")
	WebElement ConfirmPass;

	@FindBy (id = "register-button")
	WebElement RegisterBtn;
	
	@FindBy (css = "div.result")
	public WebElement SuccessMessage;//3mlth public 3shan ana h3ml assertion fel test
	
	@FindBy(linkText = "Log out")
	 public WebElement logout ;
	
	


	public void userRegisterationMethod(String firestName , String lastName , String Email , String pass) {
		clickButton(genderBotton);
		setText(InsertYourName, firestName);
		setText(insertYourLastName, lastName);
		setText(INsertYourValidEmail, Email);
		setText(INsertStrongPass, pass);
		setText(ConfirmPass, pass);
		clickButton(RegisterBtn);
		

	}
	public void logoutAfterRegisteration () {
		
		clickButton(logout);
	}
	



}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLogin  extends PageBase{

	public UserLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "Email")
	WebElement insertemail;
	
	@FindBy(id = "Password")
	WebElement insertpass;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")
	WebElement clicklogin ;
	
public void UserLoginMethod	(String mail , String pass) {
	setText(insertemail, mail);
	ClearButton(insertpass);
	setText(insertpass, pass);
	clickButton(clicklogin);
	
	
	
}
	
	
	
	
	
	
	

}

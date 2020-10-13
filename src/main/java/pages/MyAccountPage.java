package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage  extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	
	}

	
	@FindBy(linkText = "My account")
	public WebElement MyAccountLink ;

	public void openMyAccount() {
		clickButton(MyAccountLink);
	}
	
	
	
	@FindBy(linkText = "Change password")
	WebElement changePassBtn;
	
	@FindBy (id = "OldPassword")
	WebElement OldPassword ;
	
	@FindBy(id = "NewPassword")
	WebElement newPassword ;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmPassword;
	 
	@FindBy(css = "input.button-1.change-password-button")
WebElement pressChange;
public void changepPassMethod (String oldpass , String newpass, String confirmpass) {
	
	
	clickButton(changePassBtn);
	setText(OldPassword, oldpass);
	setText(newPassword, newpass);
	setText(confirmPassword, confirmpass);
	clickButton(pressChange);
	
	
}



}





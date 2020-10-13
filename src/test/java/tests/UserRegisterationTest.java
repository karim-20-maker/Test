package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLogin;
import pages.UserRegestirationPage;

public class UserRegisterationTest extends TestBase {
	
	HomePage homeobject ;
	UserRegestirationPage RegisterationObj;
	UserLogin loginObject ;
	
	@Test (priority = 1)
	public void userCanRegisterSuccessfully () {
		homeobject = new HomePage(driver);
		homeobject.OpenRegisterationPage();
		RegisterationObj = new UserRegestirationPage(driver);
		RegisterationObj.userRegisterationMethod("karim", "ahmed", "test@atu25nx13m2.com", "1212123");
		Assert.assertTrue(RegisterationObj.SuccessMessage.getText().contains("Your registration completed"));

		
	}
	
	@Test (dependsOnMethods ="userCanRegisterSuccessfully" )
	public void registeredUsercanLogOut() {
		RegisterationObj.logoutAfterRegisteration();
		
	}
	@Test (dependsOnMethods ="registeredUsercanLogOut" )
	public void UserCanLogin() {
		homeobject = new HomePage(driver);
		homeobject.Openloginpage();
		loginObject= new UserLogin(driver);
		loginObject.UserLoginMethod("test@atu25nx13m2.com", "1212123");
	
	}
	
		
		

	
	
	

}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserLogin;
import pages.UserRegestirationPage;

public class ChangePassTest  extends TestBase{
	
	
	
	HomePage homeobject ;
	UserRegestirationPage RegisterationObj;
	UserLogin loginObject ;
	MyAccountPage MyAccountObj;
	String mail = "messi89mn@kj.com" ;
	@Test (priority = 1)
	public void userCanRegisterSuccessfully () {
		homeobject = new HomePage(driver);
		homeobject.OpenRegisterationPage();
		RegisterationObj = new UserRegestirationPage(driver);
		RegisterationObj.userRegisterationMethod("karim", "ahmed", mail, "1212123");
		Assert.assertTrue(RegisterationObj.SuccessMessage.getText().contains("Your registration completed"));

		
	}
	@Test (dependsOnMethods ="userCanRegisterSuccessfully" )
	public void userCanChangePass() {
MyAccountObj = new MyAccountPage(driver);
MyAccountObj.openMyAccount();

MyAccountObj.changepPassMethod("1212123", "55554444", "55554444");



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
		loginObject.UserLoginMethod(mail, "1212123");
	
	}
	
	
	
	
	
	
	
	

}

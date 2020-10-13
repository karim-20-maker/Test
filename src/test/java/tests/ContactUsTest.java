package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
	ContactUsPage contactObj ;
	HomePage homeObj ;
	
	@Test 
	public void usercancontactus () {
		
		homeObj = new HomePage(driver);
		homeObj.clickOnContactUs();
		contactObj = new ContactUsPage(driver);
		contactObj.contactUsMethod("karim", "messi@hk.com", "test");
		Assert.assertEquals(contactObj.SeccessMsg.getText(), "Contact Us");
		
		
	}
	
	
	
	
	
	
	
	

}





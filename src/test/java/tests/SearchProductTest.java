package tests;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchProductTest extends TestBase {
	
	String productName = "Apple MacBook Pro 13-inch" ;
	SearchPage searchObj ; 
	
	
	
	
	@Test 
	public void userCanSearchProduct() {
		searchObj = new SearchPage(driver);
		searchObj.productSearch(productName);
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	

}

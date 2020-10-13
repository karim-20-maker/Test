package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(id = "small-searchterms")
WebElement SearchTextBox;
@FindBy(css = "input.button-1.search-box-button")
WebElement SearchBottun ;
@FindBy(id = "ui-id-5")
WebElement autofill; 


public void productSearch (String productName) {
	
	
	setText(SearchTextBox, productName);
	clickButton(SearchBottun);
	
	
	
	
	
	
	
	
}}
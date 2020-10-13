package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilitiesOrHelper.Helper;

public class TestBase {

	public static WebDriver driver ; 


	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional ("firefox") String browserName) {
		
		if (browserName.equalsIgnoreCase("firefox")) {
			String firefoxpath = System.getProperty("user.dir")+"/drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("chrom")) {
			
			String chrompath = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrom.driver", chrompath);
			driver = new ChromeDriver();
			
			
			
			
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");



	}


	@AfterSuite
	public void stopDriver () {
		driver.quit();
	}



// take sc when test case fail 
	@AfterMethod
	public void ScreenShotOnFailure(ITestResult result ){
		if (result.getStatus()==ITestResult.FAILURE)
			
		{
			System.out.println("failed!");
			System.out.println("take screenshot");
			Helper.captureScreenshot(driver, result.getName());
		}
		
		
		
		
	}










}

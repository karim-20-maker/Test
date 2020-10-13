package utilitiesOrHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	//method to take screenshot when the test fail
	public static void captureScreenshot (WebDriver diver , String ScreenshotName) {

		Path destnation = Paths.get("./ScreenShots",ScreenshotName+ ".png");
		try {
			Files.createDirectories(destnation.getParent());
			FileOutputStream out = new FileOutputStream(destnation.toString());
			out.write(((TakesScreenshot)diver).getScreenshotAs(OutputType.BYTES));
			out.close();



		} catch (IOException e) {
			System.out.println("exception while taking screenshot"+ e.getMessage());
		}





	}

}

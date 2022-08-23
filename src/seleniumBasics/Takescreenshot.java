package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Takescreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		takescreenshot("googlehoempage");

	}

	public static void takescreenshot(String filename) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// we will get the screen as file format
		FileUtils.copyFile(file, new File(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\SeleniumProject\\Seleneium_project_screeenshots\\"
						+ filename + ".png"));

	}
public void getshot(String filename) throws IOException {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("//s;dfa"+filename+".png"));
}
}

package windowhandling.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/draggable/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//driver.get("https://jqueryui.com/draggable/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://jqueryui.com/draggable/'");
		js.executeScript("alert('Url Launched Successfully')");
		
		
	}

}

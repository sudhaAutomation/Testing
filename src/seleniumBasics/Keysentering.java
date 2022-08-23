package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysentering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		action.moveToElement(search).sendKeys(Keys.ARROW_DOWN).build().perform();;
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();;
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}

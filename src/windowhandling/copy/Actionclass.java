package windowhandling.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.epfindia.gov.in/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.partialLinkText("Establishme"))).build().perform();
		//driver.findElement(By.partialLinkText("Establishme"));
	}

}

////body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]
////body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]
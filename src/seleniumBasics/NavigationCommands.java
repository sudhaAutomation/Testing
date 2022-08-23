package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// Naviagtion commands
		// navigateTo
		// naviagte.refresh
		// naviaget.backword
		// naviagte .forward

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");// used to launch the new url
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		// driver.get("http://www.google.com");

		driver.navigate().to("http://www.google.com");// used to launch the multiple urls in the same browser
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}

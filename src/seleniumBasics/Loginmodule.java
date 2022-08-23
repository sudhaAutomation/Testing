package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginmodule {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		// className locator
		// driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		// driver.findElement(By.className("form-control")).sendKeys("123456");
		// driver.findElement(By.className("btn btn-primary pull-right")).click();

		// name locator
		// driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		// Thread.sleep(2000);
		// driver.findElement(By.name("password")).sendKeys("123456");
		// Thread.sleep(2000);
		// driver.findElement(By.name("submit")).click();
		// Thread.sleep(3000);

		// cssselector
		// driver.findElement(By.cssSelector("body > div > div > div.middle > form >
		// div:nth-child(1) > input"))
		// .sendKeys("admin@admin.com");
		// Thread.sleep(2000);
		// driver.findElement(By.cssSelector("body > div > div > div.middle > form >
		// div:nth-child(2) > input")).sendKeys("123456");
		// Thread.sleep(2000);
		// driver.findElement(By.cssSelector("body > div > div > div.middle > form >
		// div:nth-child(3) > input")).click();
		// Thread.sleep(3000);

		// xpath locator
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).click();
		Thread.sleep(3000);

		driver.close();
	}

}

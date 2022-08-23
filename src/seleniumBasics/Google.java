package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// https://www.google.com/
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com/");
		// Thread.sleep(2000);
		// driver.findElement(By.linkText("Gmail")).click();
		// Thread.sleep(3000);
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		System.out.println("logged in successfully");
		driver.close();
	}

}

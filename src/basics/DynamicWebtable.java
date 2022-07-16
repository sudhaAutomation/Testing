package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		 //Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("123456");
		// Thread.sleep(2000); //driver.findElement(By.name("submit")).submit();...1
		 driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
		

	}

}

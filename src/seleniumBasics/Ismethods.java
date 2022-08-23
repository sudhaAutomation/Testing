package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://api.freecrm.com/register/");
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());//true
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).isDisplayed());//true
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'I Agree to the terms and conditions')]")).isDisplayed());//true
		

	}

}

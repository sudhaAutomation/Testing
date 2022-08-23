package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing File");
		//driver.switchTo().frame("aswift_0");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		
		//driver.close();
		
		
	}

}

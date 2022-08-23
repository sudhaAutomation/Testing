package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//launch the url in the chrome browser
		
	
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		
		//customised xpath
		//tagname[@locator='locatortext']
		
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		//Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		driver.close();//to close the current window which is by the selenium

	}

}

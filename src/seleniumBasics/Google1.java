package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//launch the url in the chrome browser
		
		System.out.println(driver.getCurrentUrl());
		
		String expurl="https://opensource-demo.orangehrmlive.com/";
		String acturl=driver.getCurrentUrl();
		System.out.println(expurl);
		
		if (acturl.equals(expurl)) {
			System.out.println("url luanched is succesfully");
		} else {
			System.out.println("url luanching is failed");
		}
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).submit();
		String exptitle="Orange";
		String acttitle=driver.getTitle();
		System.out.println(exptitle);
		
		if (acttitle.contains(exptitle)) {
			System.out.println("login is succesfull with valid test data");
		} else {
			System.out.println("login is failed with valid test data");
		}
		
		
		//Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		driver.close();//to close the current window which is by the selenium

	}

}

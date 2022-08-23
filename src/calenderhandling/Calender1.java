package calenderhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//login to the module
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//to goto calender
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();
		//handle the date
		Select selmnt=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		selmnt.selectByVisibleText("Jun");
		Select selyr=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
		selyr.selectByVisibleText("2025");
		
		String expdt="30";
		//tbody/tr/td/a[text()="23"]
		driver.findElement(By.xpath("//tbody/tr/td/a[text()="+expdt+"]")).click();
		
	}

}

package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/draggable/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		//Thread.sleep(3000);
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}

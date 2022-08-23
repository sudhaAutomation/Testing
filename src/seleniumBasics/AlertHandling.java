package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		// Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		//// span[contains(text(),'Courses List')]
		// span[text()='Courses List']
		driver.findElement(By.xpath("//span[contains(text(),'Courses List')]")).click();
		//// *[@id="myTable"]/tbody/tr[1]/td[2]/a[1]
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[2]/a[1]")).click();
		
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		//alt.dismiss();
		alt.accept();
		Thread.sleep(2000);
		// Are you sure you want to Delete?
		driver.close();
		
	}

}

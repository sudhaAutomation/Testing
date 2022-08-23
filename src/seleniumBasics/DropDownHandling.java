package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		// String errormes =
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]")).getText();
		// System.out.println("system throwed an error message that is " + errormes);

		String acttitle = driver.findElement(By.xpath("//div[text()='admin']")).getText();
		String exptitle = "admin";
		System.out.println(acttitle);

		if (acttitle.contains(exptitle)) {
			System.out.println("login successfull");
		} else {
			String errormes = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]")).getText();
			System.out.println("system throwed an error message that is " + errormes);
		}

		driver.findElement(By.partialLinkText("Send Message")).click();// send message link

		Select sele = new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		sele.selectByVisibleText("testing");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys("Testing COurse");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys("https://course.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']"))
				.sendKeys("testing batch starts soon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();
		Thread.sleep(2000);
		driver.close();
	}

}

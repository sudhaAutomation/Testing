package DataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendMessageTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();

	}

	@DataProvider
	public String[][] gettestdata() throws IOException {
		String[][] testdata = Utilclass.getexceldata();
		return testdata;
	}

	@Test(dataProvider = "gettestdata")

	public void sendMessageTest(String SelectCategory, String CourseName, String Courseurl, String Message,
			String Results) {
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[6]/a[1]")).click();
		Select drop = new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		drop.selectByVisibleText(SelectCategory);
		driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys(CourseName);
		driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys(Courseurl);
		driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']")).sendKeys(Message);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		if (Results.equals("Pass")) {
			
			if (acttitle.contains("Swhizz")) {
				Assert.assertTrue(true, "Exp Title and act tile are matched");

			} else {
				Assert.assertTrue(false, "Exp Title and act tile are matched");
			}

		} else if(Results.equals("Fail")) {
			
			if (acttitle.contains("Swhizz")) {
				Assert.assertTrue(false, "exp title and act title should not matched");
			} else {

				Assert.assertTrue(true, "exp title and act tile are not matched ");
			}

		}

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After method Annotation");
		driver.close();
	}
}

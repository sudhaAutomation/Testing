package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		// login module
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/form[1]/div[3]/input[1]")).click();
		// find Class Schedule List
		driver.findElement(By.xpath("//a[@title='Class Schedule List']")).click();
		/// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]...first
		/// row...first colo
		// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]...second
		/// row..first col
		// html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]
		int rows = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr"))
				.size();
		System.out.println(rows);
		int cols = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td"))
				.size();
		System.out.println(cols);
		String firsthalfxpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out
						.print(driver.findElement(By.xpath(firsthalfxpath + i + "]/td[" + j + "]")).getText() + "    ");

			}
		System.out.println();

		}
		for (int i = 1; i <= rows; i++) {
			String coursname=driver.findElement(By.xpath(firsthalfxpath + i + "]/td[1]")).getText();
			//System.out.println(coursname);
			if (coursname.equals("Salesforce Training")) {
				driver.findElement(By.xpath("//tbody/tr[4]/td[8]/a[2]/i[1]")).click();
				break;
			}

		}
	}

}

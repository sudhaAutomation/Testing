package calenderhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		// dealing with calender

		String Expmntyr = "Sept 2026";
		String expdt = "18";

		while (true) {
			String actmntyr = driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
			System.out.println("actual month and year is "+actmntyr);
			if (actmntyr.equals(Expmntyr)) {
				System.out.println("exp month&year and actual month year both are same");
				driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr/td[text()=" + expdt + "]")).click();
				break;
			} else {
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();
			}
		}
	}//// input[@id='onward_cal']

}

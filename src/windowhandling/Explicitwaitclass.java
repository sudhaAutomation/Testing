package windowhandling;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.css.parser.Locator;

public class Explicitwaitclass {// explicit wait will perform on perticular elemnet only

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://epfindia.gov.in/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Establishme"))).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")).click();
		// explicitwaittime(driver, 30,
		// driver.findElement(By.xpath("//a[contains(text(),'Exempted Return
		// Manual')]")));
		//
		// WebDriverWait w = new WebDriverWait(driver, 30);
		//
		// w.until(ExpectedConditions
		// .elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Exempted
		// Return Manual')]"))))
		// .click();

		FluentWait wait2 = new FluentWait(30);
		WebElement loc = (WebElement) wait2.withTimeout(20, TimeUnit.SECONDS).pollingEvery(20, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(
						driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]"))));
		loc.click();
	}

	public static void explicitwaittime(WebDriver driver, int timeunit, WebElement element) {

		WebDriverWait l = (WebDriverWait) new WebDriverWait(driver, timeunit).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

}

package windowhandling.copy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// will launch the brower
		driver.get(" https://www.keralartc.com/main.html");// parent window

		driver.findElement(By.xpath("//a[text()='E-Ticketing']")).click();// child window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'City Circular')]")).click();// child window
		Thread.sleep(2000);
		// String window = driver.getWindowHandle();
		// System.out.println(window);
		// driver.switchTo().window(window);

		Set<String> wind = driver.getWindowHandles();

		Iterator<String> it = wind.iterator();
		System.out.println(it.hasNext());
		String parentwindowid = it.next();// 1 time
		System.out.println(it.hasNext());
		String Circularwindow1 = it.next();// 2 time
		System.out.println(it.hasNext());
		String ETicketwindow1 = it.next();// 3 time
		//System.out.println(it.hasNext());

		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		driver.switchTo().window(ETicketwindow1);
		Thread.sleep(2000);
		//driver.switchTo().window(Circularwindow1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel Tickets')]")).click();
		Thread.sleep(3000);

		//
		// driver.close();
		driver.quit();
	}

}

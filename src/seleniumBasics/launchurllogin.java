package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchurllogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//will launch the brower
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();//will launch the brower
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();//will launch the brower
		driver1.manage().window().maximize();
		driver1.get("https://digitechinc.in/demos/1swishzz_staging/admin");//this will launch the url in the browser
		
	driver.close();//close the browser
	}

}

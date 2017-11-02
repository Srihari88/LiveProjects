package WebSIte_class;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {

	public static WebDriver driver;
	public static String Url = "http://www.pitchvision.com/#/";
	public static String browser = "chrome";

	public void init() {
		selectBrowser(browser);
		getURL(Url);

	}

	public static void selectBrowser(String browser) {
		if (browser.equals(browser)) {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "/Users/reenupanwar/Desktop/Selenium Software/chromedriver 4");
			 * driver = new ChromeDriver();
			 * log.info("Creating the object of the " + browser);
			 */

			driver = new FirefoxDriver();

		} else if (browser.equals(browser)) {

			// driver = new FirefoxDriver();
			// log.info("Creating the object of the " + browser);

		}
	}

	public static void getURL(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}

package Website_testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebSIte_class.HomePage;
import WebSIte_class.testBase;

import java.util.logging.Logger;

public class TC001_vefifyLoginPageWithInvalidCredentials extends testBase {
	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());
	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void vefifyLoginPageWithInvalidCredentials() throws Exception {

		HomePage home = new HomePage(driver);
		home.LoginApplication("Arun22", "sree");
		Thread.sleep(10000);
	}

	@AfterClass
	public void endTest() {
		// driver.close();

	}

}

package WebSIte_class;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	Actions act;

	// ====User Login====

	@FindBy(xpath = ".//*[@id='site-head']/ul[2]/li/a")
	WebElement ClickLogin;

	@FindBy(xpath = ".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]/div/form/div[1]/div[1]/div/div[2]/input")
	WebElement Username;

	@FindBy(xpath = ".//*[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@class='width-35 pull-right btn btn-sm btn-primary main-reg-log-submit']")
	WebElement Submit;

	// ====User registration page===

	@FindBy(xpath = ".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]/div/form/div[2]/span/a")
	WebElement clickRegister;

	@FindBy(name = "first_name")
	WebElement Enter_Fname;

	@FindBy(name = "last_name")
	WebElement Enter_Lname;

	@FindBy(name = "nickname")
	WebElement Enter_Kname;

	@FindBy(name = "email")
	WebElement Enter_email;

	@FindBy(xpath = ".//*[@id='password']")
	WebElement Enter_pwd;

	@FindBy(xpath = ".//*[@id='repassword']")
	WebElement Enter_Repwd;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/input")
	WebElement Click_DOB;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[2]/span/button[1]")
	WebElement Select_Today;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[7]/button")
	WebElement Register;

	public void dropdown() {
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");

	}

	public void dateSet() {
		int i;
		for (i = 1; i <= 50; i++) {
			driver.findElement(By
					.xpath(".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[1]/div/table/thead/tr[1]/th[1]"))
					.click();

		}
	}

	public void Refresh() {
		driver.navigate().refresh();
	}

	@FindBy(xpath = "//div[contains(text(),'Please specify correct date of birth')]")
	WebElement DateVerificationText;

	public void DoB() {
		List<WebElement> dates = driver.findElements(By.xpath(
				".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[1]/div/table/tbody/tr/td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("15")) {
				dates.get(i).click();
				break;
			}
		}

	}

	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement RegisterPlayer;

	@FindBy(xpath = "//div[contains(text(),’Thanks for registering with us - please check your mail.’)")
	WebElement SuccessRegister;

	// ======Create a post======

	@FindBy(xpath = ".//*[@id='site-head']/ul[2]/li[1]")
	WebElement ClickOnPostButton;

	@FindBy(xpath = ".//*[@id='shareMessagesubject']")
	WebElement Enter_Sub;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[1]/div[2]/div/textarea")
	WebElement Enter_Conversation;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[2]")
	WebElement Select_Audience;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[3]/div[3]/table/tbody/tr/td[1]/div/label/span/span")
	WebElement Select_Onlyme;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/span")
	WebElement Share_Post;

	@FindBy(xpath = "//img[@src='/cdn/images/interactive.png']")
	WebElement moveOver;

	@FindBy(xpath = "//button[@class='fa fa-search fa-inverse']")
	WebElement ClickOut;

	@FindBy(xpath = "//aside[@id='site-nav']")
	WebElement SideNagNames;

	@FindBy(xpath = "//a")
	WebElement Alllinks;

	// ======Go to the portal and create the match status for the user//

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginApplication(String Uname, String pwd) {
		ClickLogin.click();

		Username.sendKeys(Uname);

		Password.sendKeys(pwd);

		Submit.click();

	}

//	public void RegisterApplication(String Fname, String Lname, String Kame, String email, String pwd, String repwd) {
//
//		ClickLogin.click();
//		log.info("Click on the login link" + ClickLogin);
//		clickRegister.click();
//		log.info("Click on the register link" + clickRegister);
//		Enter_Fname.sendKeys(Fname);
//		log.info("Enter the first name of the Field " + Enter_Fname);
//		Enter_Lname.sendKeys(Lname);
//		log.info("Enter the last name of the Field " + Enter_Lname);
//		Enter_Kname.sendKeys(Kame);
//		log.info("Enter the nick name of the Filed " + Enter_Kname);
//		Enter_email.sendKeys(email);
//		log.info("Enter the email of the Field " + Enter_email);
//		Enter_pwd.sendKeys(pwd);
//		log.info("Enter the passwrod of the Filed" + Enter_pwd);
//		Enter_Repwd.sendKeys(repwd);
//		log.info("Reenter the password of the Field " + Enter_Repwd);
//		dropdown();
//		Click_DOB.click();
//		dateSet();
//		DoB();
//		RegisterPlayer.click();
//		// SuccessRegister.getText();
//		// System.out.println(SuccessRegister.getText());
//
//	}

//	public void shortName_Validtion(String Fname, String Lname, String Kame, String email, String pwd, String repwd) {
//
//		Enter_Fname.sendKeys(Fname);
//		log.info("Enter the first name of the Field " + Enter_Fname);
//		Enter_Lname.sendKeys(Lname);
//		log.info("Enter the last name of the Field " + Enter_Lname);
//		Enter_Kname.sendKeys(Kame);
//		log.info("Enter the nick name of the Filed " + Enter_Kname);
//		Enter_email.sendKeys(email);
//		log.info("Enter the email of the Field " + Enter_email);
//		Enter_pwd.sendKeys(pwd);
//		log.info("Enter the passwrod of the Filed" + Enter_pwd);
//		Enter_Repwd.sendKeys(repwd);
//		log.info("Reenter the password of the Field " + Enter_Repwd);
//		dropdown();
//		Click_DOB.click();
//		dateSet();
//		DoB();
//		RegisterPlayer.click();
//		// SuccessRegister.getText();
//		// System.out.println(SuccessRegister.getText());
//		Refresh();
//
//	}

	public void Share_post(String Sub, String Conversation) {
		ClickOnPostButton.click();
		Enter_Sub.sendKeys(Sub);
		Enter_Conversation.sendKeys(Conversation);
		Select_Audience.click();
		Select_Onlyme.click();
		Share_Post.click();
	}

	public void SideNag() throws Exception {

		int i = 1;
		int j = 1;
		for (i = 1; i < 5; i++) {
			Actions act = new Actions(driver);
			act.moveToElement(moveOver).perform();
			Thread.sleep(2000);
			for (j = 1; j < 5; j++) {
				act.moveToElement(ClickOut).perform();
			}

		}

	}

	public void CheckAllLinks() {

		String underConsTitle = "Not Found";

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
	}

}

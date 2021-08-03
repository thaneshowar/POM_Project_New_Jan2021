package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();

		// LoginPage loginpage1 = new LoginPage();
		// PageFactory create instends of new keyword in object create because this is
		// page object model for pass the driver other class
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassWord("abc123");
		loginpage.clickSigninButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		BrowserFactory.tearDown();
	}

}

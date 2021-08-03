package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebElement driver;

	public LoginPage() {

	}

	public LoginPage(WebElement driver) {
		this.driver = driver;

	}

// Element library
	// WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
	// By locator = By.xpath("//input[@id='username']");

	// in order to find the webelement
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_FIELD;

	// Interactive method
	// Single technique
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassWord(String Password) {
		PASSWORD_FIELD.sendKeys(Password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_FIELD.click();
	}

	// combined technique
	/*
	 * //public void testLogin(String userName, String Password) {
	 * USERNAME_FIELD.sendKeys(userName); PASSWORD_FIELD.sendKeys(Password);
	 * SIGNIN_BUTTON_FIELD.click();
	 */
}

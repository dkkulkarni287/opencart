package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	// constructor

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// locators

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgMyAccount;


	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement clkMyAccount;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	WebElement clkLogout;

	public boolean verifyMyAccMsg() {

		return msgMyAccount.isDisplayed();

	}

	public void clickMyAcc() {

		clkMyAccount.click();

	}


	public void clickLogout() {

		clkLogout.click();

	}

}

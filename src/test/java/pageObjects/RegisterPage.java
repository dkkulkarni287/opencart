package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	
	public RegisterPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//h1[normalize-space()='Register Account']")
	WebElement msgRegister;

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPwd;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPwd;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPolicy;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;


	public void setFirstName(String fname ) {
		txtFirstName.sendKeys(fname);	
	}

	public void setLastName (String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail (String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelephone (String phone) {
		txtTelephone.sendKeys(phone);
	}

	public void setPwd(String pwd) {
		txtPwd.sendKeys(pwd);
	}

	public void setConfirmPwd(String pwd) {
		txtConfirmPwd.sendKeys(pwd);
	}

	public void selectPrivacy() {
		chkPolicy.click();
	}

	public void clickContinue() {		
		btnContinue.click();	

	}

	public String Confirmationmsg() {

		try {
			return msgConfirmation.getText();
		} catch (Exception e) {
			return(e.getMessage());
		}
	}

	public String Registermsg() {

		return msgRegister.getText();

	}		

}
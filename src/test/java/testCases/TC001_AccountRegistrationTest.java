package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	
	@Test (groups = {"Sanity", "Master"})
	public void verifyAccountRegistration() {
		
		HomePage hp = new HomePage(driver);
		RegisterPage regpage = new RegisterPage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(regpage.Registermsg(), "Register Account");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+ "@gmail.com");
		regpage.setTelephone(randomNumber());
		String pwd = randomAlphanumeric();
		regpage.setPwd(pwd);
		regpage.setConfirmPwd(pwd);
		regpage.selectPrivacy();
		regpage.clickContinue();
		sa.assertEquals(regpage.Confirmationmsg(), "Your Account Has Been Created!" );
		sa.assertAll();
			
	}
	
	
	  

}

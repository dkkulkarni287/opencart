package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.Dataprovider;

public class TC002_LoginTest extends BaseClass {
	
	@Test (dataProvider ="logindata" , dataProviderClass=Dataprovider.class, groups = {"Regression","Master"})
//	@Parameters({"Email","Password"})
	public void verifyLogin(String email, String pwd ) {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean conifrmmsg = myacc.verifyMyAccMsg();
		Assert.assertEquals(conifrmmsg, true);
		System.out.println(conifrmmsg);
		myacc.clickMyAcc();
		myacc.clickLogout();
		}
		}

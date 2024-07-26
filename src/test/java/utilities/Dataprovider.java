package utilities;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
    @DataProvider(name = "logindata")
	public Object[][] loginTestData() {
		
		Object[][] logintestdata = new Object[3][2];
		logintestdata[0][0] = "fname@gmail.com";
		logintestdata[0][1] = "password123";
		logintestdata[1][0] = "fname1@gmail.com";
		logintestdata[1][1] = "password123";
		logintestdata[2][0] = "fname2@gmail.com";
		logintestdata[2][1] = "password123";
		
		return logintestdata;
	}
	
	

}

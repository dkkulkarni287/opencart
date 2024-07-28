package utilities;

import java.io.IOException;

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
	
    @DataProvider(name = "logindata_xl")
	public String [][] getData() throws IOException {
		String path=".\\testData\\LoginTestData.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("LoginData");	
		int totalcols=xlutil.getCellCount("LoginData",1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData("LoginData",i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
   	}



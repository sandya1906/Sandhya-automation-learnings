package Automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datang {
	@Test(dataProvider="getData")
	public void LoginTest(String username,String password,String result,String browser)
	{
		
	}
	@DataProvider
	 public Object[][] getData(){
		Object[][] data=new Object[3][4];
		data[0][0]="u1";
		data[0][1]="p1";
		data[0][2]="pass";
		data[0][3]="mozilla";
		
		data[1][0]="u2";
		data[1][1]="p2";
		data[1][2]="pass";
		data[1][3]="chrome";
		
		data[2][0]="u3";
		data[2][1]="p3";
		data[2][2]="fail";
		data[2][3]="IE";
		return data;	
	}

}

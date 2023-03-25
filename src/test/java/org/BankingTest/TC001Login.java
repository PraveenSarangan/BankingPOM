package org.BankingTest;

import org.Banking.SeleniumBase.BankingBase;
import org.BankingPages.LoginPage;
import org.testng.annotations.Test;

public class TC001Login extends BankingBase{
	
	@Test(dataProvider = "data")
	public void LoginTest(String[] data) throws InterruptedException {
		
		/*
		 * LoginPage lp = new LoginPage(); lp.enterUserName("mngr483040");
		 * lp.enterPassword("zevupEs"); lp.clickLogin();
		 */
	
	new LoginPage()
	.enterUserName(data[0])
	.enterPassword(data[1])
	.clickLogin();
	Thread.sleep(5000);
	
		
	}

}

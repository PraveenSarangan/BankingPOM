package org.BankingPages;

import org.Banking.SeleniumBase.BankingBase;


public class LoginPage extends BankingBase{

	//RemoteWebDriver driver;

	public LoginPage enterUserName(String  username) {
		driver.findElementByName("uid").sendKeys(username);
		return this;

	}

	public LoginPage enterPassword(String pass) {
		driver.findElementByName("password").sendKeys(pass);
		return this;
	}

	public DashBoardPage clickLogin() {

		driver.findElementByName("btnLogin").click();
		return new DashBoardPage();


	}

	}






package org.Banking.SeleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BankingBase {
	protected static RemoteWebDriver driver;

	String BankUrl="http://www.demo.guru99.com/V4/";
	
	@DataProvider(name ="data")
	public String[][] dataProvider() {
		String[][] excel = ReadExcel.getExcel("TC0001");
		return excel;
	}
@BeforeMethod
	public void starApp()
	{
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(BankUrl);
	}
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
	}

}

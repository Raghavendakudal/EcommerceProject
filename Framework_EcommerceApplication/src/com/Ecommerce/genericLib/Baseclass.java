package com.Ecommerce.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Ecommerce.PageObjectRepositoryLib.AdminLoginPage;
import com.Ecommerce.PageObjectRepositoryLib.AdminLogoutPage;


public class Baseclass 
{
	public static WebDriver Driver;

	@BeforeClass
	public void ConfigBeforeClass()
	{
		
		if (Constants.Browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
			Driver= new InternetExplorerDriver();
		}
		else
			if (Constants.Browser.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				Driver=new ChromeDriver();
			}
			else
				if (Constants.Browser.equals("FireFox"))
				{
					//System.setProperty("webdriver.firefox.driver", "");
					Driver=new FirefoxDriver ();
				}
	}
	@AfterClass
	public void ConfigAfterClass()
	{
		Driver.quit();
	}
	@BeforeMethod
	public void ConfigBeforeMethod()
	{
		String ExpectedResultDashboard="Dashboard";
		AdminLoginPage ALI = PageFactory.initElements(Driver,AdminLoginPage.class);
		ALI.LogintoNpCom();
		String ActualResultDashboard=ALI.VerifyDasboardisPresent().getText();
		Assert.assertEquals(ActualResultDashboard, ExpectedResultDashboard);
	}
	@AfterMethod
	public void ConfigAfterMethod()
	{
		AdminLogoutPage ALO = PageFactory.initElements(Driver, AdminLogoutPage.class);
		ALO.LogoutfromNpCom();
	}
}






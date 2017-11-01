package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.Ecommerce.genericLib.Baseclass;
import com.Ecommerce.genericLib.Constants;

public class AdminLoginPage 
{
 @FindBy(id="Email")
 private WebElement AdminLogin_Username;
 
 @FindBy(id=("Password"))
 private WebElement AdminLogin_Password;
 
 @FindBy(xpath=("//input[@value='Log in']"))
 private WebElement AdminLogin_LoginButton;
 
 @FindBy(xpath=("//div[@class='content-header']/h1"))
 private WebElement VerifyDasboard;
 
public WebElement VerifyDasboardisPresent()
{
	return VerifyDasboard;
}
 
 
 public void LogintoNpCom()
 {
	 Baseclass.Driver.manage().window().maximize();
	 Baseclass.Driver.get(Constants.URL);
	 AdminLogin_Username.sendKeys(Constants.UserId);
	 AdminLogin_Password.sendKeys(Constants.Password);
	 AdminLogin_LoginButton.click();
	 
 }
}

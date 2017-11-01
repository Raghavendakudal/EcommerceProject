package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ecommerce.genericLib.WebDriverCommonLib;
public class AdminLogoutPage extends WebDriverCommonLib
{
@FindBy(xpath=("//a[@href='/logout']"))
private WebElement Admin_LogoutLink;

public void LogoutfromNpCom()
{
	MoveCursorOverElement(Admin_LogoutLink);
}

}

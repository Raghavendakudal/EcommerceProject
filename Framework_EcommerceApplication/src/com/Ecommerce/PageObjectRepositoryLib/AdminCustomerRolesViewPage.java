package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCustomerRolesViewPage 
{
@FindBy(xpath=("//a[@href='/Admin/CustomerRole/Create']"))
private WebElement AddCustomerRolesButton;

@FindBy(xpath=("//a[@href='Edit/6']"))
private WebElement EditCustomerRolesButton;


public void OpenCustomerRolesAddpage()
{
	AddCustomerRolesButton.click();
}
}

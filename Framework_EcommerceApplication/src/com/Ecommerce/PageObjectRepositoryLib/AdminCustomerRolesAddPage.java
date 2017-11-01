package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCustomerRolesAddPage 
{
	@FindBy(id=("Name"))
	private WebElement CustomerName;

	@FindBy(id=("SystemName"))
	private WebElement CustomerSystemName;

	@FindBy(xpath=("//button[@name='save']"))
	private WebElement CustomerRoleAddpageButton;

	@FindBy(linkText=("back to customer role list"))
	private WebElement BackButton;

	public void AddCustomerRole(String CustName,String SysName)
	{
		CustomerName.sendKeys(CustName);
		CustomerSystemName.sendKeys(SysName);
		CustomerRoleAddpageButton.click();
	}

}

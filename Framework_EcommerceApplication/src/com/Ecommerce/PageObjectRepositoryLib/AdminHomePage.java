package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ecommerce.genericLib.Baseclass;
import com.Ecommerce.genericLib.WebDriverCommonLib;

public class AdminHomePage extends Baseclass
{
	
WebDriverWait wait =new WebDriverWait(Baseclass.Driver,20);
	
@FindBy(xpath=("(//span[text()='Customers'])[1]"))
private WebElement MainCustomersLink;

@FindBy(xpath=("//div[@class='content-header clearfix']/h1"))
private WebElement VerifyCustomerRoleHead;

@FindBy(xpath=("//*[text()='Catalog']"))
private WebElement CatalogMenu;

@FindBy(xpath=("//span[text()='Categories']"))
private WebElement SubCatlogmenu;



public WebElement VerifyCustomerRoleHeading()
{
	return VerifyCustomerRoleHead;
}

public void OpenCustomersRoles()
{
	MainCustomersLink.click();
	WebElement SubCustomerRole=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Customer roles']")));
	SubCustomerRole.click();
}

public void OpenCategorySubmenu()
{
	CatalogMenu.click();
	WebElement CatSubmenu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Categories']")));
	CatSubmenu.click();
}
}

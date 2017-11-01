package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCustomerRolesEditpage 
{
@FindBy(id=("customerrole-delete"))
private WebElement Deletebutton;

@FindBy(linkText=("back to customer role list"))
private WebElement BackButton;

@FindBy(xpath=("//button[@class='btn btn-primary pull-right']"))
private WebElement DeletePopupAccept;

@FindBy(xpath=("//span[@class='btn btn-default']"))
private WebElement DeletePopupCancel;


public void DeleteCustomerRole()
{
	Deletebutton.click();
}
}

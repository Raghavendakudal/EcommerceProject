package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminViewCategorypage 
{
@FindBy(xpath=("//a[@href='/Admin/Category/Create']"))
private WebElement AddCategoryButton;

public void OpenAddCategoryPage()
{
	AddCategoryButton.click();
}


}

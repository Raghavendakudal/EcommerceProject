package com.Ecommerce.PageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ecommerce.genericLib.Baseclass;
import com.Ecommerce.genericLib.WebDriverCommonLib;

public class AdminAddCategoryPage 
{
WebDriverCommonLib WDCL= new WebDriverCommonLib();

@FindBy(id=("Name"))
private WebElement Category_Name;

@FindBy(xpath=("//*[@id='Description_ifr']"))
private WebElement Category_Description;

@FindBy(id=("ParentCategoryId"))
private WebElement Category_ParentCategory;

@FindBy(xpath=("//button[@name='save']"))
private WebElement save;

public void AddCategory(String CatName,String CatDescrip, String CatParentCat)
{
	Category_Name.sendKeys(CatName);
	WDCL.Iframes(Category_Description,CatDescrip);
	WDCL.SelectbyVisibleText(Category_ParentCategory, CatParentCat);
	WDCL.MoveCursorOverElement(save);
}
}

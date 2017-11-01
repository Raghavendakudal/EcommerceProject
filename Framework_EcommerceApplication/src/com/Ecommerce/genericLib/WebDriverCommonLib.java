package com.Ecommerce.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ecommerce.genericLib.Baseclass;

public class WebDriverCommonLib 
{

	public void WaitForPageToLoad()
	   {
		   Baseclass.Driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	   }
	public void WaitandClickwhenElementisLocated(WebElement We)
	{
		WebDriverWait wait=new WebDriverWait(Baseclass.Driver,200);
		
	}
		   
	   public void AcceptAlert()
	   {
		   Alert Alt_Accept=Baseclass.Driver.switchTo().alert();
		   Alt_Accept.accept();
	   }
	   
	   public void DismissAlert()
	   {
		   Alert Alt_Dismiss= Baseclass.Driver.switchTo().alert();
		   Alt_Dismiss.dismiss();
	   }
	   
	   public void SelectByValue(WebElement WE,String value)
	   {
		   Select sel =new Select(WE);
		   sel.selectByValue(value);
	   }
	   
	   public void SelectByIndex(WebElement WE, int Index)
	   {
		   Select sel= new Select(WE);
		   sel.selectByIndex(Index);
	   }
	   
	   public void SelectbyVisibleText(WebElement WE,String value)
	   {
		   Select sel= new Select(WE);
		   sel.selectByVisibleText(value);
	   }
	 
	   public void MoveCursorOverElement(WebElement we)
	   {
		   Actions act= new Actions(Baseclass.Driver);
		   act.moveToElement(we).click().perform();
	   }
	   
	   public void Iframes(WebElement We, String value)
	   {
		    Baseclass.Driver.switchTo().frame(We);
			WebElement FrameDescript=Baseclass.Driver.switchTo().activeElement();
			FrameDescript.sendKeys(value);
			Baseclass.Driver.switchTo().defaultContent();
	   }

}

package com.NopCommerce.Practise;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practise 
{
	public static void main(String[] args) throws IOException, Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		/*driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
		WebDriverWait wait =new WebDriverWait(driver,20);
		WebElement CustomerRole=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Customer roles']")));
		CustomerRole.click();
		driver.findElement(By.xpath("//a[@href='/Admin/CustomerRole/Create']")).click();
		driver.findElement(By.id("Name")).sendKeys("A");
		driver.findElement(By.xpath("//button[@name='save']")).click();
		driver.findElement(By.xpath("//a[Contains(text(),'Logout')]")).click();*/
		driver.findElement(By.xpath("//*[text()='Catalog']")).click();
		WebDriverWait Wait= new WebDriverWait(driver,200);
		WebElement Category=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Categories']")));
		
		//WebDriverWait wait= new WebDriverWait(driver,200);
		//WebElement close=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='userDataLightBox_accountCreatedSection']/div[5]/span[text()='Close']")));
		Category.click();
		driver.findElement(By.xpath("//a[@href='/Admin/Category/Create']")).click();
		driver.findElement(By.id("Name")).sendKeys("Laptop Bags");
		
		WebElement Frame=driver.findElement(By.xpath("//*[@id='Description_ifr']"));
		driver.switchTo().frame(Frame);
		WebElement CFrame=driver.switchTo().activeElement();
		CFrame.sendKeys("This is about Laptop Bags");
		driver.switchTo().defaultContent();
		
		WebElement Selbyval=driver.findElement(By.name("ParentCategoryId"));
		Select Sel=new Select(Selbyval);
		Sel.selectByVisibleText("Computers");
		
		driver.findElement(By.id("DisplayOrder")).sendKeys("1");
		WebElement save=driver.findElement(By.xpath("//button[@name='save']"));
		Actions act= new Actions(driver);
		act.moveToElement(save).build().perform();
		List<WebElement> tbody=driver.findElements(By.xpath("//tbody[@role='rowgroup']/tr/td[1]"));
		for (WebElement items : tbody) 
		{
		
		if (items.getText().equals("Computers >> A"));
		{
			break;
		}
		}
}
}

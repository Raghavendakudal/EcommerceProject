package com.Ecommerce.AdminTestscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Ecommerce.PageObjectRepositoryLib.AdminAddCategoryPage;
import com.Ecommerce.PageObjectRepositoryLib.AdminHomePage;
import com.Ecommerce.PageObjectRepositoryLib.AdminViewCategorypage;
import com.Ecommerce.genericLib.Baseclass;
import com.Ecommerce.genericLib.ExcelLib;

@Test
public class TC002VerifythatNewCategoryisAdded extends Baseclass
{
	ExcelLib Ex=new ExcelLib();
	
	public void VerifythatNewCategoryisAdded()
	{
		AdminHomePage AHP= PageFactory.initElements(Driver, AdminHomePage.class);
		AHP.OpenCategorySubmenu();
		
		AdminViewCategorypage AVCP= PageFactory.initElements(Driver, AdminViewCategorypage.class);
		AVCP.OpenAddCategoryPage();
		
		AdminAddCategoryPage AACP= PageFactory.initElements(Driver, AdminAddCategoryPage.class);
		AACP.AddCategory("LapTop Bags","This section is Releated to LapTop Bags", "Computers");
	}

}

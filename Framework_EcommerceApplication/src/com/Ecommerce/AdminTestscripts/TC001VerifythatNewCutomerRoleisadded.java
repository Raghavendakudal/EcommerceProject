package com.Ecommerce.AdminTestscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.PageObjectRepositoryLib.AdminCustomerRolesAddPage;
import com.Ecommerce.PageObjectRepositoryLib.AdminCustomerRolesViewPage;
import com.Ecommerce.PageObjectRepositoryLib.AdminHomePage;
import com.Ecommerce.genericLib.Baseclass;
import com.Ecommerce.genericLib.ExcelLib;

@Test
public class TC001VerifythatNewCutomerRoleisadded extends Baseclass {
	ExcelLib EX= new ExcelLib();
	
	
	public void VerifythatNewCutomerRoleisadded() throws Throwable 
	{
		String CustName=EX.GetdatafromExcel("CustomerRole", 1, 2);
		String SysName=EX.GetdatafromExcel("CustomerRole", 1, 3);
		
		
		String CRheadingExpectedResult="Customer roles";
		AdminHomePage HP = PageFactory.initElements(Driver, AdminHomePage.class);
		HP.OpenCustomersRoles();
		String CRheadingActualResult=HP.VerifyCustomerRoleHeading().getText();
		Assert.assertEquals(CRheadingActualResult, CRheadingExpectedResult);

		AdminCustomerRolesViewPage ACRVP = PageFactory.initElements(Driver,AdminCustomerRolesViewPage.class);
		ACRVP.OpenCustomerRolesAddpage();

		AdminCustomerRolesAddPage ACRAP = PageFactory.initElements(Driver,AdminCustomerRolesAddPage.class);
		ACRAP.AddCustomerRole(CustName,SysName);
	}
}

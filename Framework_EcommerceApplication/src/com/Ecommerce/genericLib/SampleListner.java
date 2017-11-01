package com.Ecommerce.genericLib;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class SampleListner implements ItemListener
{
	public void onTestFailure(ITestResult r) 
	{
		String FaileTestCaseName =r.getMethod().getMethodName();
		EventFiringWebDriver eDriver= new EventFiringWebDriver(Baseclass.Driver);
		File SrcFile= eDriver.getScreenshotAs(OutputType.FILE);
		File DstFile = new File("./Screenshot/"+FaileTestCaseName+".png");
		try
		{
			FileUtils.copyFile(SrcFile, DstFile);
		}
		catch( IOException e)
		{

		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}
}



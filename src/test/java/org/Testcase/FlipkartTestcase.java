package org.Testcase;

import java.net.MalformedURLException;


import org.Flipkart.PageObject.Brand;
import org.Flipkart.PageObject.Cancel;
import org.Flipkart.PageObject.Fillter;
import org.Flipkart.PageObject.Mobile;
import org.Flipkart.base.BaseConfigurationFlipkart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartTestcase extends BaseConfigurationFlipkart {
	public Brand branbobj;
	public Cancel cancelobj;
	public Mobile mobileobj;
	public Fillter fillterobj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		cancelobj = new Cancel(driver);
		mobileobj = new Mobile(driver);
		branbobj= new  Brand(driver);
		fillterobj = new Fillter(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		cancelobj.CancelAction();
		mobileobj.MobileNavigation();
		branbobj.clickBrand();
		fillterobj.cancelBrand();
		
	}



}

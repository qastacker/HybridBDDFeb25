package com.Runner;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.GKPages.GKHomePage;
import com.PageObjects.GreenKartPageObjects;
import com.PageObjects.GreenKartTxtContentSetup;

public class GK_testngTest {

	public WebDriver driver;
	GreenKartTxtContentSetup GKTS;
	GreenKartPageObjects gkPOM;
	GKHomePage GKHP;
	
	public GK_testngTest() throws Exception {
		GKTS = new GreenKartTxtContentSetup();
		this.GKHP=GKTS.gkPOM.getGKHomePage();
	}
	
	
	@Test
	public void startGreenKartPage() {
		Assert.assertTrue(GKHP.getGKPageTitle().contains("GreenKart"));
	}
	
}

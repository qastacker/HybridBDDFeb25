package com.PageObjects;

import org.openqa.selenium.WebDriver;

import utilities.testBase;


public class GreenKartTxtContentSetup {

	public WebDriver driver;
	public testBase TesTBase;
	public GreenKartPageObjects gkPOM;
	
	
	public GreenKartTxtContentSetup() throws Exception {
		TesTBase = new testBase();
		gkPOM = new GreenKartPageObjects(TesTBase.WebDriverManager());
	}
}

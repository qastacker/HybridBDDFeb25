package com.PageObjects;

import org.openqa.selenium.WebDriver;

import com.GKPages.GKHomePage;


public class GreenKartPageObjects {

	public WebDriver driver;
	public GKHomePage gkHomPage;

	public GreenKartPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public GKHomePage getGKHomePage() {
		gkHomPage = new GKHomePage(driver);
		return gkHomPage;
	}
	
	
}

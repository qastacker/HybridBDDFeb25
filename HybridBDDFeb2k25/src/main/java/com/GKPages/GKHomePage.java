package com.GKPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GKHomePage {

	public WebDriver driver;
	
	public GKHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getGKPageTitle() {
		return driver.getTitle();	
	}
}

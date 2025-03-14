package com.GKPages;

import org.openqa.selenium.By;
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
	
	public String getProductName() {
		return driver.findElement(By.xpath("//h4[@class='product-name']")).getAttribute("innerHTML");
		//return driver.findElement(By.xpath("//h4[@class='product-name' and contains(text(),'"+ele+"')]"));
	}
}

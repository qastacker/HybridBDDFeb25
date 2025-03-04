package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.GKPages.GKHomePage;
import com.PageObjects.GreenKartTxtContentSetup;

import io.cucumber.java.en.Given;

public class GreenKartEcomStepDef {

	public WebDriver driver;
	public GreenKartTxtContentSetup GKTxtCP; 
	public GKHomePage GKHP;
	
	public GreenKartEcomStepDef(GreenKartTxtContentSetup GKTxtCP) {
		this.GKTxtCP = GKTxtCP;
		this.GKHP = GKTxtCP.gkPOM.getGKHomePage();
	}
	
	@Given("I want to Launch the GreenKart")
	public void navigate_to_FirstPage(String website) {
		Assert.assertTrue(GKHP.getGKPageTitle().contains("GreenKart"));
	} 
	

	
}

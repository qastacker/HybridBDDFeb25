package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.GKPages.GKHomePage;
import com.PageObjects.GreenKartPageObjects;
import com.PageObjects.GreenKartTxtContentSetup;

import io.cucumber.java.en.Given;

public class GreenKartEcomStepDef {

	public WebDriver driver;
	GreenKartTxtContentSetup GKTxtCP; 
	GreenKartPageObjects gkPOM;
	GKHomePage GKHP;
	
	public GreenKartEcomStepDef(GreenKartTxtContentSetup GKTxtCP) throws Exception {
		//GKTxtCP = new GreenKartTxtContentSetup();
		this.GKTxtCP=GKTxtCP;
		this.GKHP = GKTxtCP.gkPOM.getGKHomePage();
	}
	
	@Given("I want to Launch the GreenKart")
	public void i_want_to_launch_the_green_kart() {
		Assert.assertTrue(GKHP.getGKPageTitle().contains("GreenKart"));
	} 
	

	
}

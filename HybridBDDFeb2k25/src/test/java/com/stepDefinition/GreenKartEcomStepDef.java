package com.stepDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.GKPages.GKHomePage;
import com.PageObjects.GreenKartPageObjects;
import com.PageObjects.GreenKartTxtContentSetup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GreenKartEcomStepDef {

	public WebDriver driver;
	GreenKartTxtContentSetup GKTxtCP; 
	GreenKartPageObjects gkPOM;
	GKHomePage GKHP;
	
	public GreenKartEcomStepDef() throws Exception {
		GKTxtCP = new GreenKartTxtContentSetup();
		this.GKHP = GKTxtCP.gkPOM.getGKHomePage();
	}
	
	@Given("I want to Launch the GreenKart")
	public void i_want_to_launch_the_green_kart() {
		Assert.assertTrue(GKHP.getGKPageTitle().contains("GreenKart"));
	}
	
	@Then("Check the list of {string} displayed")
	public void check_list_of_displayed_items(String itemType) {
		checkProductFromListDisplayed(itemType);
	}
	
	@And("Select the list of displayed {string}")
	public void select_list_of_displayed_items(String itemType) {
		selectListofDisplayedItems(itemType);
	}
	
	public void selectListofDisplayedItems(String itemType) {
		String[] getProdList = checkItemsListDisplayed(itemType);
		for(String root:getProdList) {
			Map<String,String> extractItemQtyFromExcel = new HashMap<>();
		}
	}
	
	public String[] checkItemsListDisplayed(String itemType) {
		switch(itemType) {
			case "RootVegetables":
				return getRootVegList();
		case "ExoticVegetables":
				return	getExoticVegList();
			case "ExoticFruits":
				return	getExoticFruitsList();
			case "DryFruits":
				return getDryFruitsList();
			default:
				throw new IllegalArgumentException("No Such Item List");	
		}	
	}
	
	public void checkProductFromListDisplayed(String itemType) {
		String[] getProdList = checkItemsListDisplayed(itemType);
		for(String root:getProdList) {
			if(GKHP.getProductName().contains(root)) {
				System.out.println(root+" - is displayed");
			}
		}		
	}
	
	public String[] getRootVegList() {
		return new String[] {"Potato","Beetroot","Carrot","Radish","Ginger","Yam"};
	}
	
	public String[] getExoticVegList() {
		return new String[] {"Brocolli","Mushroom"};	
	}
	
	public String[] getExoticFruitsList() {
		return new String[] {"Rasberry","Strawberry","Mango","Pears"};
	}
	
	public String[] getDryFruitsList() {
		return new String[] {"Almonds","Pista","Cashew","Walnut"};
	}
	
}

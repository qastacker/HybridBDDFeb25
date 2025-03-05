package com.Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resource/com/features",
			glue="com.stepDefinition",
			monochrome=true,
			dryRun=false,
			tags="@PlaceOrderer"
//			,plugin= {
//					"html:target/cucumber.html"
//					,"json:target/cucumber.json"
//			}
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}

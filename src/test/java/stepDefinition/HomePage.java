package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePage {
	@Given("The user is in Add Tariff Plan page.")
	public void the_user_is_in_Add_Tariff_Plan_page() {
	
		    // Write code here that turns the phrase above into concrete actions
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	

	@When("The user fills in the valid Plan details.{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fills_in_the_valid_Plan_details(String MonthRental, String FreeLocMins, String FreeIntMins, String FreeSMS, String LocCharges, String IntCharges, String SMSCharges) {
	    // Write code here that turns the phrase above into concrete actions
		AddTariffPlan add = new AddTariffPlan();
		add.getMonthRental().sendKeys(MonthRental);
		add.getFreeLocMins().sendKeys(FreeLocMins);
		add.getFreeIntMins().sendKeys(FreeIntMins);              
		add.getFreeSMS().sendKeys(FreeSMS);
		add.getLocCharges().sendKeys(LocCharges);
		add.getIntCharges().sendKeys(IntCharges);
		add.getSMSCharges().sendKeys(SMSCharges);
		
	}

	@When("The user clicks the submit buttons.")
	public void the_user_clicks_the_submit_buttons() {
	    // Write code here that turns the phrase above into concrete actions
		AddTariffPlan add = new AddTariffPlan(); 
		   add.getSubmit().click();    			
	}

	@Then("The user shouid see the Sucess Message.")
	public void the_user_shouid_see_the_Sucess_Message() {
	    // Write code here that turns the phrase above into concrete actions
		  Assert.assertTrue(Hooks.driver.findElement(By.tagName("h2")).isDisplayed());
	}

	@When("The user clicks the Reset button.")
	public void the_user_clicks_the_Reset_button() {
	    // Write code here that turns the phrase above into concrete actions
		Hooks.driver.findElement(By.xpath("//input[@value='Reset']")).click();
	}

	@Then("The user shouid see the Form Cleared.")
	public void the_user_shouid_see_the_Form_Cleared() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(Hooks.driver.findElement(By.tagName("h1")).isDisplayed()); 
	}


	
			
	

}

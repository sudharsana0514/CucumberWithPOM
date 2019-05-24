package stepDefinition;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPlan {
	
	public AddTariffPlan()
	{
		PageFactory.initElements(Hooks.driver,this);
	}
	

	@FindBy(id = "rental1")
	private WebElement MonthRental;
	
	@FindBy(id = "local_minutes")
	private WebElement FreeLocMins;
	
	@FindBy(id = "inter_minutes")
	private WebElement FreeIntMins;
	
	@FindBy(id = "sms_pack")
	private WebElement FreeSMS;
	
	@FindBy(id = "minutes_charges")
	private WebElement LocCharges;
	
	@FindBy(id = "inter_charges")
	private WebElement IntCharges;
	
	@FindBy(id = "sms_charges")
	private WebElement SMSCharges;
	
	@FindBy(name = "submit")
	private WebElement submit;
	
	
	
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getMonthRental() {
		return MonthRental;
	}

	public WebElement getFreeLocMins() {
		return FreeLocMins;
	}

	public WebElement getFreeIntMins() {
		return FreeIntMins;
	}

	public WebElement getFreeSMS() {
		return FreeSMS;
	}

	public WebElement getLocCharges() {
		return LocCharges;
	}

	public WebElement getIntCharges() {
		return IntCharges;
	}

	public WebElement getSMSCharges() {
		return SMSCharges;
	}



	
}

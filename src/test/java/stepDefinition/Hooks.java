package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
public static WebDriver driver;

@Before
public void launchURL()
{
	System.setProperty("webdriver.chrome.driver","D:\\Cucumber\\Cucumber01\\driver\\chromedriver.exe");
  	 driver = new ChromeDriver();
  	driver.get("https://demo.guru99.com/telecom");
    driver.manage().window().maximize();
} 
    @After
    public void quit()
    {
    	driver.quit();
    }

}
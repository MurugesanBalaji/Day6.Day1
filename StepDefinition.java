package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public ChromeDriver driver;
	@Given("Open the Chrome Browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	@And("Load the application url")
	public void loanUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the Username as {string}")
	public void passUsername(String uName) {	
		driver.findElement(By.id("username")).sendKeys(uName);		
	}
	@And("Enter the Password as {string}")
	public void passPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("click on login button")
	public void loginButton() {	
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
	    boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	    if(displayed) {
	    	System.out.println("Homepage launched");
	    }
	    else
	    	System.out.println("Unable to launge Homepage");
	}
	
	@But("Error Message should be displayed")
	public void verifyErrorMessage() {
	    boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	    if(displayed) {
	    	System.out.println("Error Message launched");
	    }
	    else
	    	System.out.println("Unable to Launch Error Mesasage");
	}
	
}

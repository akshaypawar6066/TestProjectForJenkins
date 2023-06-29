package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
//	CTRL + SHIFT + O
	@Given("user is at login page")
	public void navToLoginPage()
	{
		System.out.println("Navigate to login page");
	}
	
	@When("user enters password")
	public void enterPassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user enters username")
	public void entersUsername()
	{
		System.out.println("entering username");
	}

	
	@When("user click on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on login button");
	}
	
	@Then("user redirects to home page")
	public void validateHomePage()
	{
		System.out.println("Validating on Home page");
	}
	
}

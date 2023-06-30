package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LandingPageSteps {
	
	
	@Given("User should be at landing page")
	public void user_should_be_at_landing_page() {
	   System.out.println("Given statement");
	}

	@Then("user should see the title of page")
	public void user_should_see_the_title_of_page() {
	   System.out.println("Then statement");
	}

}

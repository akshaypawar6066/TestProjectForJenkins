package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class ScenarioOutlineSteps {
		
		@Given("user is at the landing page")
		public void navToLandingPage() {
		    System.out.println("Given statement for Background");
		}
		
		@When("User click on create account button")
		public void clickOnCreateButton() {
		   System.out.println("When statement for Background");
		}
		
		
		
		@Given("User is at signup")
		public void user_is_at_signup() {
		    System.out.println("Given statement");
		}
	
		@When("User enters name {string} in the form")
		public void user_enters_name_in_the_form(String string) {
		   System.out.println("Entered name is : "+string);
		}
	
		@When("User enters age {int} inside form")
		public void user_enters_age_inside_form(Integer int1) {
			  System.out.println("Entered age is : "+int1);
		}
	
		@When("User confirms {string} checkbox")
		public void user_confirms_checkbox(String string) {
			 System.out.println("Entered gender is : "+string);
		}
	
		@Then("User gets created")
		public void user_gets_created() {
		   System.out.println("Then statement");
		}
	
	
	}

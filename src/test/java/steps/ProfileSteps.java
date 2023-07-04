package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("User is at the home page")
	public void user_is_at_the_home_page() {
	   System.out.println("Given for Add profile");
	}

	@When("User clicks on Add Profile button")
	public void user_clicks_on_add_profile_button() {
	    System.out.println("When statement for add profile");
	}

	@When("User enters information")
	public void user_enters_information() {
		System.out.println("When statement for data addition");
	}

	@Then("Profile gets created")
	public void profile_gets_created() {
	   System.out.println("Then statement for add profile");
	}

	@When("User clicks on edit Profile button")
	public void user_clicks_on_edit_profile_button() {
		System.out.println("When statement for edit profile");
	}

	@When("User updates information")
	public void user_updates_information() {
	    System.out.println("When statement for update profile");
	}

	@Then("Profile gets updated")
	public void profile_gets_updated() {
	    System.out.println("Then statement forn update profile");
	}

	@When("User clicks on delete Profile button")
	public void user_clicks_on_delete_profile_button() {
		System.out.println("When statement for delete profile");
	}

	@Then("Profile gets deleted")
	public void profile_gets_deleted() {
	    System.out.println("Then statement for delete profile");
	}

}

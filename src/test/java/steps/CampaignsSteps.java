package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {
	
	
	@Given("User is at campaign page")
	public void user_is_at_campaign_page() {
	   System.out.println("Given statement");
	}

	@When("User click on create campaign button")
	public void user_click_on_create_campaign_button() {
	    System.out.println("Click on campaign button");
	}

	@When("User enters the information")
	public void user_enters_the_information() {
	    System.out.println("Enter campaign details");
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
	  System.out.println("Click on save button");
	}

	@Then("Campaign should get created")
	public void campaign_should_get_created() {
	 System.out.println("Campaign gets created");
	}

	@When("User click on edit campaign")
	public void user_click_on_edit_campaign() {
	    System.out.println("Click on edit campaign");
	}

	@When("User enters the sending information")
	public void user_enters_the_sending_information() {
	   System.out.println("Entering sending details");
	}

	@When("User click on schedule button")
	public void user_click_on_schedule_button() {
	   System.out.println("Scheduling the campaign");
	}

	@Then("Campaign should get schedule")
	public void campaign_should_get_schedule() {
	 System.out.println("Campaign gets scheduled");
	}

	@When("User click on send campaign")
	public void user_click_on_send_campaign() {
	    System.out.println("Sending campaigns");
	}

	@Then("Campaign status updated by Sent")
	public void campaign_status_updated_by_sent() {
	   System.out.println("Updated status of campaign");
	}

}

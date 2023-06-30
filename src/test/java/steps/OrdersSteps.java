package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("User should be logged in")
	public void user_should_be_logged_in() {
	    System.out.println("Given statement for logged in");
	}

	@Given("User should be at orders page")
	public void user_should_be_at_orders_page() {
	    System.out.println("Given statement for orders page");
	}

	@When("User click on Track order button")
	public void user_click_on_track_order_button() {
	   System.out.println("When statement for track order button");
	}

	@Then("user should see status of order")
	public void user_should_see_status_of_order() {
	    System.out.println("Then statement for current order");
	}

	@When("User clicks on history button")
	public void user_clicks_on_history_button() {
	    System.out.println("When statement for previously placed order");
	}

	@Then("user should see previously placed order info")
	public void user_should_see_previously_placed_order_info() {
	   System.out.println("Then for previously placed order");
	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
	    System.out.println("When statement for cancelled order");
	}

	@Then("user should see cancelled order info")
	public void user_should_see_cancelled_order_info() {
	    System.out.println("Then statement for cancelled order");
	}

}

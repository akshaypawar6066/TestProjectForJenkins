package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
// CTRL + SHIFT + O
@Given("user is at sign in page")
public void user_is_at_sign_in_page() {
  System.out.println("Given statement for signin");
}

@When("user enters username as {string}")
public void user_enters_username_as(String uname) {
   
	System.out.println("Entered username as "+uname);
}

@When("user enters password as {string}")
public void user_enters_password_as(String string) {
   
	System.out.println("Entered password is "+string);
}


@When("user click on submit button number {int}")
public void user_click_on_submit_button_number(Integer int1) {
   
	System.out.println("Clicked on button number : "+int1);
}


@Then("user should get logged into application")
public void user_should_get_logged_into_application() {
    
	System.out.println("Then statement");
}

}

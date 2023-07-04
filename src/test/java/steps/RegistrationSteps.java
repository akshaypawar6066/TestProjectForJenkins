package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	

@Given("User should be at the accounts page")
public void user_should_be_at_the_accounts_page() {
 
	System.out.println("Given statement for account page");
}

@When("User enters the following data")
public void user_enters_the_following_data(DataTable dataTable) {
   
  List<List<String>> data = dataTable.asLists(String.class);
  
//  List<String> data_0 = data.get(0);
//  
//  String lastname = data_0.get(1);
  
  
 String lastname =  data.get(0).get(1);
  
  System.out.println(lastname);
  
  
  
}

@When("User clicks on submit button")
public void user_clicks_on_submit_button() {
    System.out.println("When statement for submitting");
}

@Then("User should see the account number")
public void user_should_see_the_account_number() {
  System.out.println("Then statement for account generation");
}


}

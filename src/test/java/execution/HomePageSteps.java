package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;
import qa.DriverFactory2;

public class HomePageSteps {
	
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("User is at landing page")
	public void user_is_at_landing_page() {
	    WebDriver driver = DriverFactory.getDriver();
	    
	    driver.get("https://www.amazon.in/");

	}

	@Then("Page title should contains {string}")
	public void page_title_should_contains(String titletext) {
	    
		String title = homepage.fetchTitleOfPage();
		
		boolean ispresent = title.contains(titletext);
		
		Assert.assertTrue(ispresent);
	}

	@Then("Cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
		boolean isdisplayed = homepage.isCartIconDisplayed();
		
		Assert.assertTrue(isdisplayed);
	}

	@When("User click on smart phones deal")
	public void user_click_on_smart_phones_deal() {
	   homepage.enterDealsSection();
	}

	@Then("deal sectio should get open")
	public void deal_sectio_should_get_open() {
	   
		boolean isdisplayed = homepage.carouselNavigation();
		
		Assert.assertEquals(isdisplayed, true);
	}

	

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	    homepage.enterUsername(uname);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
	    homepage.enterPassword(pwd);
	}


}

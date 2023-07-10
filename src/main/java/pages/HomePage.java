package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	WebElement    cartIcon;
	
	@FindBy(xpath = "(//*[@class='a-carousel-card']//img[@alt = 'op'])[1]")
	WebElement smartPhoneCarousel;
	
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	WebElement signInHover;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//a[@class = 'nav-action-signin-button']")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	WebElement emailField;
	
	@FindBy(xpath =  "//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement finalSignIn;
	
	@FindBy(xpath = "(//*[@role='presentation'])[1]")
	WebElement smartPhones;
	
	WebDriverWait wait;
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	
	public String fetchTitleOfPage()
	{
		String titleOfPage = driver.getTitle();
		
		return titleOfPage;
	}
	
	
	public Boolean isCartIconDisplayed()
	{
		Boolean isdisplayed = cartIcon.isDisplayed();
		
		return isdisplayed;
	}
	
	
	public void enterDealsSection()
	{
		wait.until(ExpectedConditions.visibilityOf(smartPhoneCarousel));
		
		smartPhoneCarousel.click();
		
				
	}
	
	public boolean carouselNavigation() {
		boolean isVisible = false;
		
		wait.until(ExpectedConditions.visibilityOf(smartPhones));
		
		isVisible = true;
		
		return isVisible;
			
	}
	
	public void enterUsername(String uname)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(signInHover).perform();
		
		signInButton.click();
		
		emailField.sendKeys(uname);
		
		continueButton.click();
	}
	
	public void enterPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
		
		finalSignIn.click();
	}
	
	
	
	

}

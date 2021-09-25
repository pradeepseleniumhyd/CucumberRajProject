package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep 
{
	
	
	@Given("user navigates to the browser")
	public void user_navigates_to_the_browser() {
	  System.out.println("User navigates to the browser");
	}
	@When("user enter the url")
	public void user_enter_the_url() {
		System.out.println("user enter the url");
	
	}
	@Then("Login page is displayed")
	public void login_page_is_displayed() {
		System.out.println("Login page is displayed");
	  
	}
	@Then("Verify login page")
	public void verify_login_page() {
		System.out.println("Verify login page");
	    
	}




}

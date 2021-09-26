package stepDefinitions;

import java.util.List;
import java.util.Map;

import commons.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep
{
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
	
	
	@Before("@First")
    public void beforeScenario1(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After("@First")
    public void afterScenario1(){
        System.out.println("This will run after the Scenario");
    }
	
	@Before("@Second")
    public void beforeScenario11(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After("@Second")
    public void afterScenario11(){
        System.out.println("This will run after the Scenario");
    }
	
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

	@Given("^this is the first step$")
	public void This_Is_The_First_Step(){
		System.out.println("This is the first step");
	}
	
	@When("^this is the second step$")
	public void This_Is_The_Second_Step(){
		System.out.println("This is the second step");
	}
	
	@Then("^this is the third step$")
	public void This_Is_The_Third_Step(){
		System.out.println("This is the third step");
	}
	
	@When("user enter the url  {string}")
	public void user_enter_the_url(String string) {
	   System.out.println(string);
	}
	
		@When("user enter the url and username")
	public void user_enter_the_url_and_username(DataTable dataTable) {
			List<List<String>> data = dataTable.asLists(String.class);
			
			for(List<String> x: data)
			{
				System.out.println(x);
			}
			
		}
			@When("user enter the url and username with maps")
			public void user_enter_the_url_and_username_with_maps(DataTable dataTable) {
				
				List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
				
				System.out.println(data);
				System.out.println(data.get(0).get("url"));
				System.out.println(data.get(0).get("username"));

				for(Map<String, String> data1:data)
				{
					System.out.println(data1.get("url"));
					System.out.println(data1.get("username"));
				}

			 			}



			
	








}

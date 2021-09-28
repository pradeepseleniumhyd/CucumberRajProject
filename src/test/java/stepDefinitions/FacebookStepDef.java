package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookStepDef {
	
	WebDriver driver;
	
	@Given("Navigate the browser")
	public void navigate_the_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	}

	/*
	 * @When("User enters the url") public void user_enters_the_url() {
	 * driver.get("https://en-gb.facebook.com/"); }
	 */
	@When("User enters the url")
	public void user_enters_the_url(DataTable table) {
		List<String> urlvalue = table.asList();
		System.out.println(urlvalue.get(0));
		
		
		
	    driver.get("https://en-gb.facebook.com/");
	}

	@When("User enters the url {string}")
	public void user_enters_the_url(String url) {
	    driver.get(url);

	}

	@Then("Fb login page is displayed")
	public void fb_login_page_is_displayed() {
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	}

	
	@Then("user enters username and password")
	public void user_enters_username_and_password() throws Exception {
	driver.findElement(By.id("email")).sendKeys("raj@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("raj123");
	driver.findElement(By.name("login")).click();
	Thread.sleep(10000);
	String wrongcred = driver.findElement(By.id("error_box")).getText();
	System.out.println(wrongcred);
	}


	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws Exception{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		String wrongcred = driver.findElement(By.id("error_box")).getText();
		System.out.println(wrongcred);

	}

	@Before(order = 1)
	public void browserconfig()
	{
		System.out.println("Browser code");
	}

	@Before(order = 2)
	public void browserconfig1()
	{
		System.out.println("Browser code ******************************* ");
	}
	
	@After
	public void closeDriver()
	{
		driver.quit();
	}

	
	@Then("user enters username1 and password")
	public void user_enters_username1_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
				List<List<String>> credentials = dataTable.asLists();
				System.out.println(credentials.size());
				
				System.out.println(credentials.get(0).get(0));
				
				for(int i=0;i<credentials.size();i++)
				{
				driver.findElement(By.id("email")).sendKeys(credentials.get(i).get(0));
				driver.findElement(By.id("pass")).sendKeys(credentials.get(i).get(1));
				}
			
	}

	
		@Then("user enters username1 and password123")
	public void user_enters_username1_and_password123(DataTable dataTable) {
	   
			List<Map<String, String>> cred = dataTable.asMaps();
			System.out.println(cred.get(0).get("username"));
			System.out.println(cred.get(0).get("password"));
			
			
	}







}

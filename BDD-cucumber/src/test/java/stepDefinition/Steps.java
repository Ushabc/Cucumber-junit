package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class Steps {
	
	WebDriver driver;
	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\UshaBC\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	
	@When("click on submit button")
	public void click_on_submit_button(){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	@Then("Login should be successfull and see username as {string}")
	public void login_should_be_successfull_and_see_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String name = driver.findElement(By.id("welcome")).getText();
		String ActualData = string;
		Assert.assertEquals(name, ActualData);
	    System.out.println("Login successful");
	}
	
	@Then("Login should fail and should see error message as {string}")
	public void login_should_fail_and_should_see_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String actualErr=driver.findElement(By.id("spanMessage")).getText();
		String expecErr=string;
		Assert.assertEquals(actualErr, expecErr);
	   
	}
	
}

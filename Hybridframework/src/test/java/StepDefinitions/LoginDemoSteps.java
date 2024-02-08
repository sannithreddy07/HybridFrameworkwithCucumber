package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("open browser")
	public void open_browser() {
	System.out.println("************i'm using feature file and Selenium webdriver to login**********");
		driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("enter application url")
	@SuppressWarnings("deprecation")
	public void enter_application_url() {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	   }

	
	@When("^user enter (.*) and (.*)$") // .* starts and ends with
	public void enter_login_credentials_and_click_login_button(String username, String password) {
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}
	
	@And("click login")
	public void click_login() {
		driver.findElement(By.name("Submit")).click();
		
		
	   
	}

	@Then("user should see home page of app and logout of app")
	public void user_should_see_home_page_of_app_and_logout_of_app() {
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	driver.findElement(By.linkText("Logout")).click();
		driver.close();
	    }




}

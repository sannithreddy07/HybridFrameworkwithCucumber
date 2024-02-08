package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFunctionality {
	
/*	public WebDriver driver;
	
	@Given("Open browser")
	public void open_browser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    
	}

	@And("enter app url")
	public void enter_app_url() {
		driver.navigate().to("https://www.google.com/");
	 
	}

	@When("enter user input in the search box")
	public void enter_user_input_in_the_search_box() {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("QAFox");
		
		
	    
	}

	@And("hit Enter")
	public void hit_enter() {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		
	    
	}

	@Then("View results and close browser")
	public void view_results_and_close_browser() {
		driver.getPageSource().contains("Selenium"); // it will search for this word in page source
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Selenium']")).isDisplayed()); 
		driver.close();
		
	    
	}*/




}

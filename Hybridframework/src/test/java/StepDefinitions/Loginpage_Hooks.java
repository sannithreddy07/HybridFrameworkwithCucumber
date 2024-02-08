package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage_Hooks {
	
	/*public WebDriver driver;
	
	@Before(value="@loginpageHooks",order=1) // this is called conditional hooks , here it will execute only one scenarion
	public void beforescenario() throws Exception{
		System.out.println("i'm inside the browser");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Before(order=0) // this is used to execute order wise like priority in TestNG
	public void beforeBefore() {
		System.out.println("i'm inside before order =0");
	}
	
	@After(order=1)
	public void afterscenario() {
		System.out.println("i'm outside the browser now");
		driver.close();
	}
//@After(order=0)
//	public void beforeAfter() {
		System.out.println("i'm inside after order =0");
	//}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("i'm inside step now");
		
	}
	@AfterStep
	public void afterstep() {
		System.out.println("i'm outside step now");
	}
	
	
	@Given("open browser and enter URL")
	public void open_browser_and_enter_url() {
		
		driver.navigate().to("https://classes.nareshit.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   
	}

	@When("enter uname and pwd")
	public void enter_uname_and_pwd() {
	   
	}

	@And("click login button")
	public void click_login_button() {
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	  
	}*/




}

package StepDefinitions;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps2_POM {
	
	/*public WebDriver driver;
	Loginpage_POM lpg;
	
	//@SuppressWarnings("deprecation")
	@Given("open browser")
	public void open_browser() {
		
		System.out.println("************i'm inside POM clas**********");
		
		driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("enter application url")
	public void enter_application_url() {
		 
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
				
	   }

	
	@When("^user enter (.*) and (.*)$")
	public void enter_login_credentials_and_click_login_button(String username, String password) {
		lpg=new Loginpage_POM(driver);// to maintain same session pass this webdriver instace to loginpage_POM
		lpg.enterUsername(username);
		lpg.enterPassword(password);
		
	}
	@SuppressWarnings("deprecation")
	@And("click login")
	public void click_login() {
		
		lpg.clickLoginbtn();
	
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); //if the page is taking time to load we use this to wait certain time
		
	   
	}

	@Then("home page of app and logout of app")
	public void user_should_see_home_page_of_app_and_logout_of_app() {
		lpg.clickLogoutbtn();
		
		driver.close();
	    }*/




}

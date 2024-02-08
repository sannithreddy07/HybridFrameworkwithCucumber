package StepDefinitions;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactory.Loginpage_PF;
import Pagefactory.Logoutpage_PF;
import Pages.Loginpage_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps3_PF {
	
	/*public WebDriver driver;
	Loginpage_PF login; //instace of pagefactory loginclass
	Logoutpage_PF home; //instance of pagefactory logoutclass
	
	@Given("open browser")
	public void open_browser() {
		
		System.out.println("************i'm inside PF clas**********");
		
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
	}

	@And("enter application url")
	public void enter_application_url() {
		 
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
				
	   }

	
	@When("^user enter (.*) and (.*)$")
	public void enter_login_credentials_and_click_login_button(String username, String password) { 
		login=new Loginpage_PF(driver);// to maintain same session we pass this webdriver instace to loginpage_POM
		login.enterusername(username); //it will fetch username and password form Scenario Outline
		login.password(password);
		
	}
	@SuppressWarnings("deprecation")
	@And("click login")
	public void click_login() {
		
		login.clicklogin();
	
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	   
	}

	@Then("home page of app and logout of app")
	public void user_should_see_home_page_of_app_and_logout_of_app() {
		home=new Logoutpage_PF(driver);// to maintain same session we pass this webdriver instace to logout_POM
		home.logoutpage();
		
		driver.close();
	    }*/




}

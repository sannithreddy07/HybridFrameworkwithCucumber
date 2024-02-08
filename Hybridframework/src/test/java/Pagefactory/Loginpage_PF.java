package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Loginpage_PF {
	
	public WebDriver driver;
	
	@FindBy(name = "txtUserName")
	@CacheLookup  // it will allocate memory to element and avoids using over and over
	WebElement txt_username;
	
	@FindBy(name = "txtPassword")
	WebElement txt_pass;
	
	@FindBy(name = "Submit")
	WebElement lgnbtn;
	
	public Loginpage_PF(WebDriver driver) {
		this.driver=driver;
	//	PageFactory.initElements(driver,this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
		
//for ajax apps	//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);-- it will wait untill element is located within 30secs 
		//PageFactory.initElements(factory,this);
	}
	
	public void enterusername(String usrname) {
		txt_username.sendKeys(usrname);
	}
	public void password(String psswrd) {
		txt_pass.sendKeys(psswrd);
	}
	public void clicklogin() {
		lgnbtn.click();
	}
}

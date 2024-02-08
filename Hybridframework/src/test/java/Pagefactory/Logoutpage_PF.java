package Pagefactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoutpage_PF {
	
	@FindBy(linkText = "Logout") //FindBy annotation supports all locators syntax -@FindBy(AT="AV")
	WebElement lgoutbtn; //defining a variable
public WebDriver driver;
	public Logoutpage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void logoutpage() {
		Assert.assertTrue(lgoutbtn.isDisplayed());
		lgoutbtn.click();
	}
}

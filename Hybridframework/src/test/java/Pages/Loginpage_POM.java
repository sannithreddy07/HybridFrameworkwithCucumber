package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
	
	public WebDriver driver;
	
	public Loginpage_POM(WebDriver driver) { //passing the testcript driver instace to constructor to maintain same session
		this.driver=driver;
	}
	
By txt_uname_login=By.name("txtUserName");
By txt_pass=By.name("txtPassword");
By txt_lgnbtn=By.name("Submit");
By txt_lgoutbtn=By.linkText("Logout");

public void enterUsername(String usname) {
	driver.findElement(txt_uname_login).sendKeys(usname);	
}
public void enterPassword(String passwrd) {
	driver.findElement(txt_pass).sendKeys(passwrd);
}
public void clickLoginbtn() {
	driver.findElement(txt_lgnbtn).click();
}
public void clickLogoutbtn() {
	Assert.assertTrue(driver.findElement(txt_lgoutbtn).isDisplayed());
	driver.findElement(txt_lgoutbtn).click();
}
	
	

}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
WebDriver driver;	
	public LogInPage(WebDriver Idriver) {
		driver = Idriver;
		PageFactory.initElements(Idriver, this);
	}

	@FindBy (xpath = "//input[@placeholder='Username']") WebElement userName;
	@FindBy (xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy (xpath = "//button[@type='submit']") WebElement loginbtn;
	
	public void enterLogin(String name)
	{
		userName.sendKeys(name);
	}
	
	public void enterPass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
}

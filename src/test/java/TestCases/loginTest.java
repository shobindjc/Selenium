package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.LogInPage;

public class loginTest {
	WebDriver driver;
	LogInPage li;
	@BeforeClass
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		li = new LogInPage(driver);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		li.enterLogin("Admin");
		li.enterPass("admin123");
		li.loginbtn();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
  @AfterClass
  public void quit()
  {
	  driver.quit();
  }
  
}

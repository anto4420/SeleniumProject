package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import login.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class VerifyWordpressLogin 
{
 
 
//@Test
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium-WorkSpace\\SeleniumProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 

 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);
 
 login.typeUserName("Admin");
 Thread.sleep(2000);
 login.typePassword("admin123");
 Thread.sleep(2000);
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}
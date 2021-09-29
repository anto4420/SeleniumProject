package mavenseleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Action;
public class GA {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-WorkSpace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.className("form_input")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		String output_title=driver.getTitle();
		
		System.out.println("Title is "+output_title);
		
		String expected_title="Swag Labs";
		
		Assert.assertEquals(output_title, expected_title);
		
		System.out.println("Title Verified");
		wait.withTimeout(3, TimeUnit.SECONDS);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Anto");
		driver.findElement(By.id("last-name")).sendKeys("Abijit");
		driver.findElement(By.id("postal-code")).sendKeys("600089");
		Thread.sleep(1000);
		
		//Scroll
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}

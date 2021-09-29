package mavenseleniumproject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Example {
		
		//public static void main (String[] args) throws InterruptedException {
		@Test
		public void mavsel() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","D:\\Selenium-WorkSpace\\SeleniumProject\\Drivers\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver","D:\\Selenium-WorkSpace\\SeleniumProject\\Drivers\\geckodriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			WebElement login = driver.findElement(By.name("Submit"));
			login.click();
			Thread.sleep(3000);
			driver.quit();
		}	

	}


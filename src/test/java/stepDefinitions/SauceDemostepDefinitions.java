package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemostepDefinitions {
	
	public WebDriver driver;
	@Given("User is on saucedemo page")
	public void user_is_on_saucedemo_page() {
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("no-sandbox");
        
		
	   System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Documents//chromedriver//chromedriver.exe");
	   driver = new ChromeDriver(chromeOptions);
	   // driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	 
		
		System.out.println("launch saucedemo page");
		System.out.println(driver.getTitle());
		
		
	}
	@When("User logged in with username {string} and password {string}")
	public void user_logged_in_with_username_and_password(String string, String string2) {
		
		driver.findElement(By.name("user-name")).sendKeys(string);
				//name("Username")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys(string2);
		
		System.out.println(string);
		System.out.println(string2);
		
		
		System.out.println("login with username and password");
		
				
	}
	@Then("products page is displayed")
	public void products_page_is_displayed() {
		System.out.println("products page is displayed");

		driver.findElement(By.id("login-button")).click();
		//driver.close();
	  
	}

}

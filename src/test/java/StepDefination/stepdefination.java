package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class stepdefination {
	public WebDriver driver;
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
	 driver = new ChromeDriver(); // declier object
		
        
    }

    @And("^Naviagate to url$")
    public void naviagate_to_url() throws Throwable {
    	driver.get("http://qaclickacademy.com");
      
    }

    @And("^Click on login to home page to land on secure sign in page$")
    public void click_on_login_to_home_page_to_land_on_secure_sign_in_page() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
    }

    @When("^When user enteres username and password and logs in$")
    public void when_user_enteres_username_and_password_and_logs_in() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("vivek@gmail.com");
    	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("12345");
       
    }

    @Then("^Verify that user is succesfully signed in$")
    public void verify_that_user_is_succesfully_signed_in() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='Log In']")).click();
       
    }

}

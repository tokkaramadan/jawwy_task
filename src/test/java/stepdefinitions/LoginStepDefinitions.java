package stepdefinitions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    private WebDriver driver;

    @Given("I am on the Jawwy TV login page")
    public void i_am_on_the_Jawwy_TV_login_page() {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/en/user-status");
    }

    @When("I enter my email")
    public void i_enter_my_email() {
        driver.findElement(By.name("username")).sendKeys("tokka@gmail.com");
            }

    @When("I click on the Next button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should be logged in to my account")
    //It will fail as the Login ID does not exist and the signup option is not working in this Website
    public void i_should_be_logged_in_to_my_account() {
        String expectedUrl = "https://subscribe.jawwy.tv/en/user-dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        driver.quit();
    }
	public static void main(String[] args) {
		LoginStepDefinitions obj = new LoginStepDefinitions();
		obj.i_am_on_the_Jawwy_TV_login_page();
		obj.i_enter_my_email();
		obj.i_click_on_the_login_button();
		obj.i_should_be_logged_in_to_my_account();

	}
}


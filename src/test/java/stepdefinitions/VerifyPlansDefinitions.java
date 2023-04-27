package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 

public class VerifyPlansDefinitions {


    WebDriver driver;

    @Given("I am on the Jawwy subscription page1")
    public void i_am_on_the_jawwy_subscription_page1() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }

    @Then("I should see the correct plan type, price for the first plan")
    //Should be Passed
    public void i_should_see_the_correct_plan_type_price_and_currency_for_first_plan(){
    	WebElement plan1Type = driver.findElement(By.id("name-lite"));
    	WebElement plan1Price = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/b"));
    	Assert.assertEquals(plan1Type.getText(), "LITE");
    	Assert.assertEquals(plan1Price.getText(), "5.4");
    	driver.quit();
    }
    @Given("I am on the Jawwy subscription page2")
    public void i_am_on_the_jawwy_subscription_page2() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }
    @Then("I should see the correct Currency for the first plan")
    //Should be failed as the currency is expected to be AED
    public void I_should_see_the_correct_Currency_for_the_first_plan(){
    	WebElement plan1Currency = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[1]/div/i"));
    	Assert.assertEquals(plan1Currency.getText(), "AED/month");
    	driver.quit();
    }
    
    @Given("I am on the Jawwy subscription page3")
    public void i_am_on_the_jawwy_subscription_page3() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }

    @Then("I should see the correct plan type, price for the second plan")
    //Should be Passed
    public void i_should_see_the_correct_plan_type_price_and_currency_for_second_plan(){
    	WebElement plan2Type = driver.findElement(By.id("name-classic"));
    	WebElement plan2Price = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/b"));
    	
    	Assert.assertEquals(plan2Type.getText(), "CLASSIC");
    	Assert.assertEquals(plan2Price.getText(), "10.9");
    	driver.quit();
    }
    
    @Given("I am on the Jawwy subscription page4")
    public void i_am_on_the_jawwy_subscription_page4() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }
    @Then("I should see the correct Currency for the second plan")
    //Should be failed as the currency is expected to be AED
    public void I_should_see_the_correct_Currency_for_the_second_plan(){
    	WebElement plan1Currency = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/i"));
    	Assert.assertEquals(plan1Currency.getText(), "AED/month");
    	driver.quit();
    }

    @Given("I am on the Jawwy subscription page5")
    public void i_am_on_the_jawwy_subscription_page5() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }

    @Then("I should see the correct plan type, price for the third plan")
    //Should be Passed
    public void i_should_see_the_correct_plan_type_price_and_currency_for_third_plan(){
    	WebElement plan2Type = driver.findElement(By.id("name-premium"));
    	WebElement plan2Price = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[3]/div/b"));
    	
    	Assert.assertEquals(plan2Type.getText(), "PREMIUM");
    	Assert.assertEquals(plan2Price.getText(), "16.3");
    	driver.quit();
    }  	
    	
    @Given("I am on the Jawwy subscription page6")
    public void i_am_on_the_jawwy_subscription_page6() throws Throwable {
    	String chromeDriverPath = System.getProperty("user.dir")+"\\resourses\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://subscribe.jawwy.tv/ae-en?");
    }
    @Then("I should see the correct Currency for the third plan")
    //Should be failed as the currency is expected to be AED
    public void I_should_see_the_correct_Currency_for_the_third_plan(){
    	WebElement plan1Currency = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[2]/div[3]/div[2]/div[3]/div/i"));
    	Assert.assertEquals(plan1Currency.getText(), "AED/month");
    	driver.quit();
    }
       

        

  

}

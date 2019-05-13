package stepdefinitions;

import PageObjects.HomePage;
import Utilities.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdefinitions  {

    WebDriver driver;


    @Given("^I navigate to giftrate dev site$")
    public void i_navigate_to_giftrate_dev_site() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click on login link$")
    public void i_click_on_login_link() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clickloginbutton();
        //driver.findElement(By.linkText("Login")).click();
    }

    @When("^I enter the username$")
    public void i_enter_the_username() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.typeUsername();

    }

    @When("^I enter the password$")
    public void i_enter_the_password() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.typePassword();

    }

    @When("^I click on secure signin button$")
    public void i_click_on_secure_signin_button() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clicksigninButton();
    }

    @Then("^I should logged in$")
    public void i_should_logged_in() throws Throwable

    {
        HomePage homePage = new HomePage(driver);
       homePage.LogInName();
       driver.close();

    }


    @Given("^I navigate to BootApp dev site$")
    public void iNavigateToBootAppDevSite() throws InterruptedException {
       //Baseclass.initialization();

        System.setProperty("webdriver.chrome.driver", "src//test//resources//Driver//chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.boots.com";
        driver.get(URL);
        Thread.sleep(2000);
    }
}

package stepdefinitions;

import PageObjects.HomePage;
import PageObjects.RegisterPages;
import Utilities.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static Utilities.Baseclass.driver;



public class registerSteps extends Baseclass{

      WebDriver driver;
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

    @When("^I click on login link$")
    public void i_click_on_login_link() throws Throwable {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.clickloginbutton();}
        //driver.findElement(By.linkText("Login")).click()}

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        RegisterPages registerPages = new RegisterPages(driver);

        registerPages.clickregisterButton();
    }

    @And("^I select Title from the dropdown options$")
    public void iSelectTitleFromTheDropdownOptions() {

        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.registrationtitleDropdown();


    }



    @And("^I enter Firstname and Lastname$")
    public void iEnterFirstnameAndLastname() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.typerFirstname();
        registerPages.typerLastname();


    }

    @And("^I enter Email Address$")
    public void iEnterEmailAddress() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.typerEmailAddress();

    }

    @And("^I confirm Password$")
    public void iConfirmPassword() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.typerPassword();

    }
    @And("^I enter Verifypassword$")
    public void iEnterPassword() {
        RegisterPages registerPages = new RegisterPages(driver);
       registerPages.typerVerifyPassword();
    }

    @And("^I check the agree checkbox$")
    public void iCheckTheAgreeCheckbox() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.Termandcondition();

    }

    @And("^I click on Create my account button$")
    public void iClickOnCreateMyAccountButton() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.Createaccount();

    }

    @Then("^new account will be created$")
    public void newAccountWillBeCreated() {
        RegisterPages registerPages = new RegisterPages(driver);
        registerPages.Verifyloggedname();
        driver.quit();
    }



/***
 * This Methods is used to login to Boot App
 *
 */

@And("^I enter the username$")
public void iEnterTheUsername() {
    HomePage homePage = new HomePage(driver);
    homePage.typeUsername();

}

    @And("^I enter the password$")
    public void iEnterThePassword() {
        HomePage homePage = new HomePage(driver);
        homePage.typePassword();

    }

    @And("^I click on secure signin button$")
    public void iClickOnSecureSigninButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clicksigninButton();
    }
    @Then("^I should logged in$")
    public void i_should_logged_in() throws Throwable

    {
        HomePage homePage = new HomePage(driver);
        homePage.LogInName();
        driver.quit();

    }
}

package PageObjects;

import Utilities.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import sun.security.pkcs11.wrapper.Constants;


import static Utilities.Baseclass.driver;

public class RegisterPages  {


    public RegisterPages(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Log in/register')]")
    private WebElement loginbutton;
    @FindBy(id = "WC_AccountDisplay_links_3")
    private WebElement registerButton;
    @FindBy(css = "#editRegistrationTitle")
    private WebElement registrationTitle;
    @FindBy(id = "WC_UserRegistrationAddForm_NameEntryForm_FormInput_firstName_1")
    private WebElement Firstname;
    @FindBy(id = "WC_UserRegistrationAddForm_NameEntryForm_FormInput_lastName_1")
    private WebElement Lastname;
    @FindBy(id = "WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1_1")
    private WebElement Emailaddress;
    @FindBy(id = "WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1")
    private WebElement Password;
    @FindBy(name = "reglogonPasswordVerify")
    private WebElement Verifylogonpassword;
    @FindBy(xpath = "//*[@id=\"termsAndConditions\"]")
    private WebElement Checktermandcondition;
    @FindBy(id = "WC_UserRegistrationAddForm_links_1")
    private WebElement Createaccountbutton;
    @FindBy(id = "loggedIn_name")
    private WebElement Confirmloggedname;

    public void clickloginbutton() {
        loginbutton.click();
    }

    public void clickregisterButton() {
        registerButton.click();
        //new Actions(driver).moveToElement(registerButton).click().perform();
    }

    public void registrationtitleDropdown()
    {
        Select dropdown = new Select(registrationTitle);
        dropdown.selectByVisibleText("Mr");
    }

    public void typerFirstname(){

        Firstname.sendKeys("Iggy");
    }
    public void typerLastname(){

        Lastname.sendKeys("Broda");
    }
    public void typerEmailAddress(){

        Emailaddress.sendKeys("iggyboy@hotmail.com");
    }
    public void typerPassword(){

        Password.sendKeys("Password123");
    }
    public void typerVerifyPassword(){

        Verifylogonpassword.sendKeys("Password123");
    }
    public void Termandcondition(){
        Checktermandcondition.click();
    }
    public void Createaccount(){
        Createaccountbutton.click();
    }
    public void Verifyloggedname()  {
        Confirmloggedname.isDisplayed();


    }
    /***
     * Use this Method to move the mouse on a link and click the desired option
     */
    //public void user_move_to_new_frame()
//    {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.name("name"))).build().perform();
//        driver.findElement(By.name("name")).click();
//    }
}

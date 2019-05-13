package PageObjects;

import Utilities.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/***
 * This Class will store all the objects in gift rete homepage
 */
public class HomePage extends Baseclass {


    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Log in/register')]")
     private WebElement loginbutton;
    @FindBy(linkText ="Register" )
    private WebElement registerButton;
    @FindBy (name = "logonId")
    private WebElement userIDTextBox;
    @FindBy(name = "logonPassword" )
    private WebElement passwordTextBox;
    @FindBy (id = "WC_AccountDisplay_links_2")
    private WebElement signinButton;
    @FindBy (id = "loggedIn_name")
    private WebElement LogInName;


    /*By loginbutton = By.xpath("//span[contains(text(),'Log in/register')]");
    By registerButton = By.linkText("Register");
    By userIDTextbox = By.name("logonId");
    By passwordTextBox = By.name("logonPassword");
    By signinButton = By.id("WC_AccountDisplay_links_2");*/



    public void clickloginbutton()
    {
        loginbutton.click();
    }
    public void typeUsername()
    {
      userIDTextBox.sendKeys("hulstonese@yahoo.com");
    }
    public void typePassword()
    {
        passwordTextBox.sendKeys("Igbunu03");
    }
    public void clicksigninButton()
    {
        signinButton.click();
    }
    public void LogInName ()
    {
       LogInName.isDisplayed();
    }
}

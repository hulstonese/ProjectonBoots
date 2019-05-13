package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass {
    public static WebDriver driver;

    public static Properties prop;

    public Baseclass() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Continous Automation Project\\src\\test\\java\\config\\Properties");
            prop.load(fis);
        } catch (IOException e) {
            e.getMessage();
        }

    }
    public static void initialization()
    {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src//test//resources//Driver//chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF"))
        {
            System.setProperty("webdriver.gecko.driver", "src//test//resources//Driver//geckodriver.exe");
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("https://www.boots.com"));
    }
}

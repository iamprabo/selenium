package TestClass;

import PageClass.POM_FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_FacebookLoginTest {
    //global variable section

    String BaseURL="https://www.facebook.com/";

    WebDriver TestClassChromeDriver;

    @BeforeTest
    public void BeforeTestMethod()
    {
        //WebDriverManager.chromedriver().setup();
        TestClassChromeDriver=new ChromeDriver();
        TestClassChromeDriver.manage().window().maximize();
        TestClassChromeDriver.get(BaseURL);
    }

    @Test(priority = 1)
    public void FacebookLoginPageVerifyValidLogin() throws InterruptedException
    {
        //constructor method from page class
        POM_FacebookLoginPage FBLogin=new POM_FacebookLoginPage(TestClassChromeDriver);
        FBLogin.passingValuestoUserNamePassword("prabodhyaweligamage@gmail.com", "19590927@HM@Nimal#Nirmali");
        Thread.sleep(4000);
        FBLogin.clickLoginButton();
    }

    @Test(priority = 2)
    public void verifyFacebookLoginPageTitle() throws InterruptedException
    {
        //constructor method from page class
        POM_FacebookLoginPage FBLogin=new POM_FacebookLoginPage(TestClassChromeDriver);
        boolean status=FBLogin.verifyPageTitle();

        if(status)
        {
            System.out.println("Page Title Verification: Success");
        }
        else
        {
            System.out.println("Page Title Verification: Fail");
        }
    }

    @AfterTest()
    public void AfterMethod()
    {
        //TestClassChromeDriver.quit();
    }
}

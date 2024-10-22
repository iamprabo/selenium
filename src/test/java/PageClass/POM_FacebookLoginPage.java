package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POM_FacebookLoginPage {

    //1 identify the web element/s. By class - provides a mechanism by which to find elements within a document

    By username = By.xpath("//*[@id=\"email\"]");

    By password = By.xpath("//*[@id=\"pass\"]");

    By loginButton=By.name("login");

    //2 define the web driver

    WebDriver PageClassWebdriver;

    //3 create a constructor which is same as class name

    public POM_FacebookLoginPage(WebDriver TestClassParameterDriver)
    {
        this.PageClassWebdriver=TestClassParameterDriver;
    }

    //4 initialize methods

    public void typeUserName(String userName)
    {
        //5 findElement operation and set values using parameters
        PageClassWebdriver.findElement(username).sendKeys(userName);
    }

    public void clickLoginButton()
    {
        PageClassWebdriver.findElement(loginButton).click();
    }

    public void passingValuestoUserNamePassword(String TxtuserName, String Txtpassword)
    {
        PageClassWebdriver.findElement(username).sendKeys(TxtuserName);
        PageClassWebdriver.findElement(password).sendKeys(Txtpassword);
    }

    public void passingValuestoUserNamePasswordANDClickLoginButton(String TxtuserName, String Txtpassword)
    {
        PageClassWebdriver.findElement(username).sendKeys(TxtuserName);
        PageClassWebdriver.findElement(password).sendKeys(Txtpassword);
        PageClassWebdriver.findElement(loginButton).click();
    }

    public boolean verifyPageTitle()
    {
        Assert.assertEquals("Facebook", PageClassWebdriver.getTitle());
        return true;
    }
}

package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Factory_FacebookLoginPage {

    //identify web elements

    // 1 general/normal way of find element

    @FindBy(xpath = "//*[@id=\"email\"]") WebElement userLogin;

    // 2 standard way of find element using HOW
    @FindBy(how = How.XPATH,using = "//*[@id=\"pass\"]") WebElement password;

    @FindBy(how = How.NAME,using = "login") WebElement loginButton;

    // 3 define web driver object for page class
    WebDriver WebPageClassDriver;

    // 4 constructor method
    public Factory_FacebookLoginPage(WebDriver TestClassDriver)
    {
        this.WebPageClassDriver=TestClassDriver;
    }

    // 5 initialize methods
    public void ValidateLogin(String uname, String pass)
    {
        userLogin.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void InsertValuetoUserName(String uname)
    {
        userLogin.sendKeys(uname);
    }
}

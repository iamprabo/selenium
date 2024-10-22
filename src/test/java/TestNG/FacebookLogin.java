package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {

//    //global variable section
//    String BaseURL = "https://www.facebook.com/";
//
//    WebDriver driver;
//
//    @BeforeTest
//    public void BeforeTestMethod(){
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(BaseURL);
//    }
//
//    @Test(priority = 1)
//    public void FacebookLoginUI(){
//
//        //identify the web elements in the Facebook login UI
//        WebElement email_phone_txt=driver.findElement(By.id("email"));
//        WebElement password_txt=driver.findElement(By.id("pass"));
//        WebElement login_btn=driver.findElement(By.name("login"));
//
//        //execute the actions for identified web elements in the facebook login UI
//        email_phone_txt.sendKeys("prabodhyaweligamage@gmail.com");
//        password_txt.sendKeys("19590927@HM@Nimal#Nirmali");
//        login_btn.click();
//
//    }
//
//    @Test(priority = 2)
//    public void GetPageTitle(){
//        System.out.println("The title of the facebook page is: "+ driver.getTitle());
//    }
//
//    @AfterTest
//    public void AfterTestMethod(){
//        //driver.quit();
//        System.out.println("After Test Execution");
//    }

}

package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class AdminUserSearch {

//    //global variable section
//    String BaseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//
//    WebDriver driver;
//
//    String actualText;
//
//    String expectedText;
//
//    Boolean status;
//
//    //before test section
//    @BeforeTest
//    public void BeforeTestMethod() {
//        //headless execution if needed
//        //ChromeOptions options=new ChromeOptions();
//        //options.addArguments("---headless=new--");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//    }
//
//    //test case section
//
//    // test case - search by username (TC: 001)
//    @Test(priority = 1)
//    public void searchByUsername() throws Exception {
//        System.out.println("------------------TC 001------------------");
//
//        //login to the system
//        userLogin();
//
//        //select admin sub menu item
//        adminClick();
//
//        //send the username
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
//
//        //click the search button
//        searchButtonClick();
//
//        Thread.sleep(3000);
//
//        //verify if the filter result is correct
//        expectedText = "Admin";
//        actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
//
//        //print actual text
//        System.out.println("Test Case 001 Actual Text: " + actualText);
//
//        if (expectedText.equals(actualText)) {
//            System.out.println("TC 001: PASS");
//            System.out.println("Admin search for system user by username is done successfully");
//            System.out.println("TC 001: Screen Image Captured - Success");
//            takeSnapShot(driver, "E:\\SLIIT QA Course\\New Folder\\SearchByUsernameSuccess.png");
//        }
//        else
//        {
//            System.out.println("TC 001: FAIL");
//            System.out.println("TC 001: Screen Image Captured - Fail");
//            takeSnapShot(driver, "E:\\SLIIT QA Course\\New Folder\\SearchByUsernameFail.png");
//        }
//        System.out.println("------------------------------------------");
//
//        //click reset button
//        resetButtonClick();
//    }
//
//     //test case - search by non-existing username (TC: 002)
//    @Test(priority = 2)
//    public void searchByNonExistingUsername() throws Exception {
//
//        System.out.println("------------------TC 002------------------");
//
//        //send the username
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Prabodhya");
//
//        //click the search button
//        searchButtonClick();
//
//        //verify if the filter result is correct
//        expectedText = "No Records Found";
//        actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText();
//
//        if (expectedText.equals(actualText))
//        {
//            System.out.println("TC 002: PASS");
//            System.out.println("Admin search for system non existing user by username is done successfully");
//            System.out.println("TC 002: Screen Image Captured - Success");
//            takeSnapShot(driver, "E:\\SLIIT QA Course\\New Folder\\SearchByNonExistingUsernameSuccess.png");
//        }
//        else
//        {
//            System.out.println("TC 002: FAIL");
//            System.out.println("TC 002: Screen Image Captured - Fail");
//            takeSnapShot(driver, "E:\\SLIIT QA Course\\New Folder\\SearchByNonExistingUsernameFail.png");
//        }
//        System.out.println("------------------------------------------");
//
//        //click reset button
//        resetButtonClick();
//    }
//
//    //search by user role (TC: 003)
//    @Test(priority = 3)
//    public void searchByUserRole() throws InterruptedException {
//
//        System.out.println("------------------TC 003------------------");
//
//        //user role drop down filtering
//        userRoleDropDownFilterSelection();
//
//        //click the search button
//        searchButtonClick();
//
//        //verify if the filter results is correct
//        expectedText="Admin";
//        actualText=driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[3]")).getText();
//
//        if(expectedText.equals(actualText))
//        {
//            System.out.println("TC 003: PASS");
//            System.out.println("Admin search for system user by user role is done successfully");
//        }
//        else
//        {
//            System.out.println("TC 003: FAIL");
//        }
//
//        System.out.println("------------------------------------------");
//
//        //click the reset button
//        resetButtonClick();
//
//    }
//
//    //search by employee name (TC: 004)
//    @Test(priority = 4)
//    public void searchByEmployeeName() throws InterruptedException {
//
//        System.out.println("------------------TC 004------------------");
//
//        //employee name filtering
//        employeeNameEnter();
//
//        //click the search button
//        searchButtonClick();
//
//        //verify if the filter result is correct
//        //expectedText="John S";
//        //actualText=driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[4]")).getText();
//
//        expectedText="No Records Found";
//        actualText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")).getText();
//
//        if(expectedText.equals(actualText))
//        {
//            System.out.println("TC 004: PASS");
//            System.out.println("Admin search for system user by employee name is done successfully");
//        }
//        else
//        {
//            System.out.println("TC 004: FAIL");
//        }
//
//        System.out.println("------------------------------------------");
//
//        //click reset button
//        resetButtonClick();
//    }
//
//    @Test(priority = 5)
//    public void searchByStatus() throws InterruptedException {
//
//        //resetButtonClick();
//
//        System.out.println("------------------TC 005------------------");
//
//        //select status
//        statusDropDownFilterSelection();
//
//        //click the search button
//        searchButtonClick();
//
//        //verify if the filter result is correct
//        expectedText="Enabled";
//        actualText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).getText();
//
//        if(expectedText.equals(actualText))
//        {
//            System.out.println("TC 005: PASS");
//            System.out.println("Admin search for system user by status is done successfully");
//        }
//        else
//        {
//            System.out.println("TC 005: FAIL");
//        }
//
//        System.out.println("------------------------------------------");
//
//        //click reset button
//        resetButtonClick();
//    }
//
//    @Test(priority = 6)
//    public void resetSearchFilterAndResults() throws InterruptedException {
//
//        System.out.println("------------------TC 006------------------");
//
//        //send the username
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("John Smith");
//
//        //user role filtering
//        userRoleDropDownFilterSelection();
//
//        //employee name filtering
//        employeeNameEnter();
//
//        //status filtering
//        statusDropDownFilterSelection();
//
//        //click the search button
//        searchButtonClick();
//
//        //click the reset button
//        resetButtonClick();
//
//        //verify if the reset result is correct
//        expectedText="-- Select --";
//        actualText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).getText();
//
//        if(expectedText.equals(actualText))
//        {
//            System.out.println("TC 006: PASS");
//            System.out.println("Reset button click to reset search filtering and filtered results is done successfully");
//        }
//        else
//        {
//            System.out.println("TC 006: FAIL");
//        }
//
//        System.out.println("------------------------------------------");
//
//    }
//
//    //after test section
//    public void AfterTestMethod() throws InterruptedException {
//
//    }
//
//    //supportive method section
//    public void userLogin() throws InterruptedException {
//        //calling the OrangeHRM Login Page
//        driver.get(BaseURL);
//        Thread.sleep(3000);
//
//        //identify the username text box and send value
//        driver.findElement(By.name("username")).sendKeys("Admin");
//
//        //identify the password text box and send value
//        driver.findElement(By.name("password")).sendKeys("admin123");
//
//        //identify the login button and clicks
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//
//        Thread.sleep(3000);
//
//    }
//
//    public void adminClick() throws InterruptedException {
//        //click admin menu item
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
//
//        //wait for 3 seconds till the page loads
//        Thread.sleep(3000);
//
//        //verify if the admin menu is clicked successfully
//        expectedText = "System Users";
//        actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")).getText();
//
//        if (expectedText.equals(actualText))
//        {
//            System.out.println("User clicked on Admin Sub-Menu");
//        }
//        else
//        {
//            System.out.println("Unsuccessful click on Admin Sub-Menu");
//        }
//
//    }
//
//    public void resetButtonClick() throws InterruptedException {
//        //click the reset button
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();
//
//        //wait for 5 seconds till the page loads
//        Thread.sleep(5000);
//    }
//
//    public void userRoleDropDownFilterSelection() throws InterruptedException {
//        //click the dropdown arrow under user role
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
//
//        //wait for 1 second till the drop down loads
//        Thread.sleep(1000);
//
//        //select the admin option
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]")).click();
//
//        //wait for 1 second till admin option is selected
//        Thread.sleep(1000);
//
//    }
//
//    public void searchButtonClick() throws InterruptedException {
//        //click the search button
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
//
//        //wait for 5 seconds till page loads
//        Thread.sleep(5000);
//
//    }
//
//    public void employeeNameEnter() throws InterruptedException {
//        //enter employee name
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("John S");
//
//        //wait for 2 seconds till the dropdown loads
//        Thread.sleep(2000);
//
//        //select the name suggestions
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div")).click();
//
//        //wait for 2 seconds till suggested name is selected
//        Thread.sleep(2000);
//    }
//
//    public void statusDropDownFilterSelection() throws InterruptedException {
//        //clicks the dropdown arrow under status
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
//
//        //wait for 1 second till the dropdown loads
//        Thread.sleep(1000);
//
//        //select the enabled option
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]")).click();
//
//        //wait for 1 second till enabled option is selected
//        Thread.sleep(1000);
//
//    }
//
//    public static void takeSnapShot(WebDriver webDriver, String fileWithPath) throws Exception {
//        //convert web driver object to take screenshot
//        TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
//
//        //call getscreenshotas method to create image file
//        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//
//        //move image file to new destination
//        File DestFile = new File(fileWithPath);
//
//        //copy file at destination
//        FileUtils.copyFile(SrcFile, DestFile);
//
//    }

}

package FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsTesting {

/*
    String base_url = "https://www.saucedemo.com/";
    String actual_result;
    String expected_result;
    Boolean status;

    //define the web driver
    WebDriver driver;

    @BeforeTest
    public void before_test() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void valid_signIn() throws InterruptedException {

        System.out.println("----------Testcase No : 001----------------");

        driver.get(base_url);
        Thread.sleep(3000);

        //initializing parameters
        String valid_username = "standard_user";
        String valid_password = "secret_sauce";

        Thread.sleep(3000);

        //calling login method
        login(valid_username, valid_password);

        actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        expected_result = "Products";

        if (expected_result.equals(actual_result))
        {
            System.out.println("Login Successful and Validate the Products screen : Pass");
        }
        else
        {
            System.out.println("Login Unsuccessful : Fail");
        }

        System.out.println("-------------------------------------------");
    }

    @Test(priority = 2)
    public void burger_icon() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        Thread.sleep(3000);

        WebElement closeButton = driver.findElement(By.id("react-burger-cross-btn"));
        closeButton.click();

        Thread.sleep(3000);

        System.out.println("----------Testcase No : 002----------------");
        burger_menu_icon();
        System.out.println("-------------------------------------------");
    }

    @Test(priority = 3)
    public void product_add_to_the_cart() throws InterruptedException {

        //click the "Add to cart" button
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);

        System.out.println("----------Testcase No : 003----------------");
        chart_number();

        Thread.sleep(3000);

        System.out.println("-------------------------------------------");

    }

    @Test(priority = 4)
    public void your_cart_landing_page() throws InterruptedException {

        //check the landing page by the title of the page
        System.out.println("----------Testcase No : 004----------------");
        your_cart();
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);

    }

    @Test(priority = 5)
    public void remove_button() throws InterruptedException{

        //check the Remove Button
        System.out.println("----------Testcase No : 005----------------");
        remove_from_cart();
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void checkout_information_page() throws InterruptedException {

        //check the Remove Button
        System.out.println("----------Testcase No : 006----------------");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        
        chart_number();
        Thread.sleep(3000);
        
        your_cart();
        Thread.sleep(3000);

        driver.findElement(By.id("checkout")).click();

        String expected_result = "Checkout: Your Information";
        String actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if (expected_result.equals(actual_result))
        {
            System.out.println("Validate the Checkout: Your Information Screen : Pass");
        }
        else
        {
            System.out.println("Validate the Checkout: Your Information Screen : Fail");
        }
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void checkout_function() throws InterruptedException {
        System.out.println("----------Testcase No : 007----------------");
        String firstname = "Test";
        String lastname = "Prabo";
        String postalcode = "60500";

        //sending user details through parameters
        check_out_information(firstname, lastname, postalcode);

        //calling the checkout method
        checkout_overview();
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);
    }

    @Test(priority = 8)
    public void getting_success_notification() throws InterruptedException {

        System.out.println("----------Testcase No : 008----------------");

        //click the finish button
        driver.findElement(By.id("finish")).click();

        //check the "Checkout: Complete!" landing page
        String expected_result = "Checkout: Complete!";
        String actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        //compare the expected_result and actual_result
        if (expected_result.equals(actual_result))
        {
            System.out.println("Validate the Checkout: Complete! Screen : Pass");
        }
        else
        {
            System.out.println("Validate the Checkout: Complete! Screen : Fail");
        }
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);
    }

    //redirect to Product page
    @Test(priority = 9)
    public void redirect_to_Product_page() throws InterruptedException {

        System.out.println("----------Testcase No : 009----------------");

        //click the finish button
        driver.findElement(By.id("back-to-products")).click();

        //check the "Products" landing page
        String expected_result = "Products";
        String actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        //compare the expected_result and actual_result
        if (expected_result.equals(actual_result))
        {
            System.out.println("Validate the Back Home (Products Screen) : Pass");
        }
        else
        {
            System.out.println("Validate the Back Home (Products Screen) : Fail");
        }
        System.out.println("-------------------------------------------");

        Thread.sleep(3000);
    }

    @AfterTest
    public void after_text() {

    }

    //support methods

    //valid login
    public void valid_login() throws InterruptedException {

        driver.get(base_url);

        //initializing parameters
        String valid_username = "standard_user";
        String valid_password = "secret_sauce";

        Thread.sleep(3000);

        //calling login method
        login(valid_username, valid_password);

        actual_result = driver.findElement(By.xpath("\"//*[@id=\\\"header_container\\\"]/div[2]/span\"")).getText();
        expected_result = "Products";
    }

    //login method
    public void login(String username, String password) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        //clicking the login button
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

    }

    //check whether the menu icon expand and collapse
    public void burger_menu_icon() throws InterruptedException{

        String excepted_result = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).getText();
        String actual_result = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[1]")).getText();

        //check the manu by the first item of the navigation
        if (excepted_result.equals(actual_result))
        {
            System.out.println("Open and Close the Menu Icon : Pass");
        }
        else
        {
            System.out.println("Open and Close the Menu Icon : Fail");
        }

    }

    //check whether the item is added to the cart
    public void chart_number() {

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        int expected_chat_count = 1;
        int actual_chart_count = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText());

        if (expected_chat_count == actual_chart_count)
        {
            System.out.println("User add a Item to the Cart and Validate the Cart Count : Pass");
        }
        else
        {
            System.out.println("User add a Item to the Cart and Validate the Cart Count : Fail");
        }
    }

    //check whether successfully direct to the "Your Cart" land page
    public void your_cart() throws InterruptedException {

        Thread.sleep(3000);

        //landing page execution
        String excepted_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        String actual_result = "Your Cart";

        //check the landing page by the title of the page
        if (excepted_result.equals(actual_result))
        {
            System.out.println("Validate the Your Cart Screen : Pass");

        }
        else
        {
            System.out.println("Validate the Your Cart Screen : Fail");

        }
    }

    public void remove_from_cart() {

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        System.out.println("Item is removed");

        //redirect to Product page
        driver.findElement(By.id("continue-shopping")).click();

        //lading page verification
        String expected_result = "Products";
        String actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        //landing page comparing
        if (expected_result.equals(actual_result))
        {
            System.out.println("Validate the Remove Item from the Cart : Pass");
        }
        else
        {
            System.out.println("Validate the Remove Item from the Cart : Fail");
        }
    }

    //getting check out information through parameters
    public void check_out_information(String first_name, String last_name, String postal_code) throws InterruptedException{

        //setting user information on the Checkout page
        driver.findElement(By.id("first-name")).sendKeys(first_name);
        driver.findElement(By.id("last-name")).sendKeys(last_name);
        driver.findElement(By.id("postal-code")).sendKeys(postal_code);

        Thread.sleep(3000);

        //click the button
        driver.findElement(By.id("continue")).click();
    }

    //check the overview page
    public void checkout_overview() {

        String expected_result = "Checkout: Overview";
        String actual_result = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if (expected_result.equals(actual_result)) {

            //getting the values
            String item_total_path = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")).getText();
            String tax_path = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")).getText();
            String total_path = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();

            //moving the $ sign from the values
            String numaric_item_total = item_total_path.replaceAll("[^0-9.]", "");
            String numaric_tax = tax_path.replaceAll("[^0-9.]", "");
            String numaric_total = total_path.replaceAll("[^0-9.]", "");

            //checking the Price Total section
            double item_total = Double.parseDouble(numaric_item_total);
            double tax = Double.parseDouble(numaric_tax);
            double total = Double.parseDouble(numaric_total);

            if (total == (item_total + tax))
            {
                System.out.println("Validate the Checkout: Overview Screen : Pass");
            }
            else
            {
                System.out.println("Validate the Checkout: Overview Screen : Fail");
            }
        }
    }
    */
}
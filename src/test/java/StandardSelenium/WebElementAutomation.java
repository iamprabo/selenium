package StandardSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebElementAutomation {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/SLIIT%20QA%20Course/Web%20elements.html");

        //calling methods
        OptionButton();
        CheckBoxes();
        ComoBoxes();
        DropDownList();
        Button();
        TestBox();
        DynamicTable();
        LinkText();
    }

    public static void OptionButton(){

        //identify web element
        WebElement option1=driver.findElement(By.id("vfb-7-1"));
        WebElement option2=driver.findElement(By.id("vfb-7-2"));
        WebElement option3=driver.findElement(By.id("vfb-7-3"));

        option1.click();

        if(option1.isSelected()){
            System.out.println("-----Option Button Output-----");
            System.out.println("Option 1 is selected");
        }
        else{
            System.out.println("-----Option Button Output-----");
            System.out.println("Another Option Button is selected");
        }
    }

    public static void CheckBoxes(){

        //identify web element
        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));
        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        WebElement checkBox3=driver.findElement(By.id("vfb-6-2"));

        //execute/trigger the action
        checkBox1.click();
        checkBox2.click();

        if(checkBox1.isSelected() && checkBox2.isSelected()){
            System.out.println("---Check Box Output---");
            System.out.println("Check Box 1 and 2 have been selected");
        }
        else{
            System.out.println("---Check Box Output---");
            System.out.println("Another check box/es has been selected");
        }
    }

    public static void ComoBoxes(){

        //identify web element
        Select comboBox_friuts = new Select(driver.findElement(By.id("fruits")));

        //1st option - select by visible text
        comboBox_friuts.selectByVisibleText("Banana");
        System.out.println("---Combo Box select by visible text output---");
        System.out.println("Banana");


        //2nd option - select by visible text
        comboBox_friuts.selectByIndex(2);
        System.out.println("---Combo Box select by Index output---");
        System.out.println("Orange");
    }

    public static void DropDownList() throws InterruptedException{

        //identify web element
        Select dropdown_countries=new Select(driver.findElement(By.name("country")));

        //1st option - select by visible text
        dropdown_countries.selectByVisibleText("ANGOLA");
        System.out.println("---Combo Box select by visible text output---");
        System.out.println("ANGOLA");

        Thread.sleep(5000);

        dropdown_countries.selectByIndex(14);
        System.out.println("---Combo Box select by Index output---");
        System.out.println("AUSTRIA");


    }

    public static void Button(){

        //identify web element
        WebElement submit_button=driver.findElement(By.name("submit"));

        //execute/trigger the action
        submit_button.click();
        System.out.println("---Submit Button output---");
        System.out.println("Submit button has been clicked");
    }

    public static void TestBox(){

        //identify web element
        WebElement textbox=driver.findElement(By.name("userName"));

        //execute/trigger the action
        textbox.sendKeys("Chandana");
        System.out.println("---Text Box output---");
        System.out.println("Chandana");
    }

    public static void DynamicTable(){

        //retrieving number of columns in the table
        List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        System.out.println("-------- Dynamic Table output -------------");
        System.out.println("Column count:" + columns.size());

        //retrieving number of rows in the table
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
        System.out.println("Row count:" + rows.size());

        //retrieving a cell value
        WebElement baseTable = driver.findElement(By.tagName("table"));
        WebElement tableRowText = baseTable.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]"));
        String cellValue = tableRowText.getText();
        System.out.println("The cell value is: "+ cellValue);

    }

    public static void LinkText(){

        //identify web element and execute/trigger the action
        driver.findElement(By.linkText("your destination")).click();
        System.out.println("---Hyper Link output---");
        System.out.println("Navigated to SLIIT website");
    }
    
}
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class createaccount1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //        for create account1
        WebElement signinButton1 = driver.findElement(By.xpath("//div[@class='header_user_info']"));
        signinButton1.click();

        //scrolldown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement emailbox1 = driver.findElement(By.xpath("//input[@id='email_create']"));
        emailbox1.sendKeys("alif78@gmail.com");

        WebElement button1 = driver.findElement(By.id("SubmitCreate"));
        button1.click();

        //radiobutton
        WebElement radioButton1 = driver.findElement(By.xpath("//div[@id='uniform-id_gender2']"));
        radioButton1.click();

        WebElement firstname1 = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstname1.sendKeys("Baytul");

        WebElement lastname1 = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastname1.sendKeys("Alif");

        WebElement company1 = driver.findElement(By.id("company"));
        company1.sendKeys("NASA");

        WebElement password1 = driver.findElement(By.xpath("//input[@id='passwd']"));
        password1.sendKeys("Vugijugi7");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,550)", "");

        //dropdown
        Select drpdown1 = new Select( driver.findElement(By.id("days")));
        drpdown1.selectByIndex(5);
        Select drpdown2 = new Select( driver.findElement(By.id("months")));
        drpdown2.selectByIndex(5);
        Select drpdown3 = new Select( driver.findElement(By.id("years")));
        drpdown3.selectByIndex(5);

        //checkbox
        WebElement chkbox1 = driver.findElement(By.id("newsletter"));
        chkbox1.click();
        WebElement chkbox2 = driver.findElement(By.id("optin"));
        chkbox2.click();

        WebElement addrbox1 = driver.findElement(By.id("address1"));
        addrbox1.sendKeys("Forida");

        WebElement addrbox2 = driver.findElement(By.id("address2"));
        addrbox2.sendKeys("Suite#11, Unit:2, Floor: 5, Building: 402");

        WebElement city1 = driver.findElement(By.id("city"));
        city1.sendKeys("Florida");

        Select drpdown4 = new Select( driver.findElement(By.id("id_state")));
        drpdown4.selectByIndex(31);

        WebElement post1 = driver.findElement(By.id("postcode"));
        post1.sendKeys("82580");

        Select drpdown5 = new Select( driver.findElement(By.id("id_state")));
        drpdown5.selectByIndex(1);

        WebElement addinfo1 = driver.findElement(By.id("other"));
        addinfo1.sendKeys("Available 5pm to 11pm, Phone No: 94645498");

        WebElement phn1 = driver.findElement(By.id("phone"));
        phn1.sendKeys("74645498");

        WebElement phn2 = driver.findElement(By.id("phone_mobile"));
        phn2.sendKeys("34332498");

        WebElement addrbox3 = driver.findElement(By.id("alias"));
        addrbox3.sendKeys("NewYork");


        WebElement button2 = driver.findElement(By.id("submitAccount"));
        button2.click();


        Thread.sleep(3000);
        driver.close();
    }
}

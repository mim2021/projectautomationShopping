import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class shoppingProcess {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();


       //  log in
        WebElement signinButton1 = driver.findElement(By.xpath("//div[@class='header_user_info']"));
        signinButton1.click();

        WebElement emailbox1 = driver.findElement(By.id("email"));
        emailbox1.sendKeys("alif78@gmail.com");

        WebElement password1 = driver.findElement(By.id("passwd"));
        password1.sendKeys("Vugijugi7");

        WebElement button1 = driver.findElement(By.id("SubmitLogin"));
        button1.click();

        //select T-shirt section
        WebElement tshirt1 = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
        tshirt1.click();

        //filterblue
        WebElement chkbox1 = driver.findElement(By.id("layered_id_attribute_group_14"));
        chkbox1.click();

        //scrolldown
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,650)", "");

        //mousehover
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        Actions action = new Actions(driver);
        action.moveToElement(button2).perform();

        //addtocart
        WebElement button3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"));
        button3.click();

        //checkoutbutton
        WebElement checkoutb1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        checkoutb1.click();


        //scrolldown
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,550)", "");

        // proceedtocheckout
        WebElement button4 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        button4.click();
        WebElement button5 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
        button5.click();

        //scrolldown
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,550)", "");

        //  agreecheckbox
        WebElement chkbox2 = driver.findElement(By.id("uniform-cgv"));
        chkbox2.click();

        //   checkout
        WebElement chkbox3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
        chkbox3.click();

      //    paybycheckoption

        WebElement paychecksec = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
        paychecksec.click();

        //   confirmOrder
        WebElement button6 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
        button6.click();

        //scrollup
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(550,0)", "");

        //   signout
        WebElement signOut = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
        signOut.click();

        Thread.sleep(4000);
        driver.close();
        driver.quit();



    }

}
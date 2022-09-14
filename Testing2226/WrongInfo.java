package Testing2226;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WrongInfo {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String EXE_PATH = "C:\\Users\\pc\\Downloads\\chromedriver.exe";
    private final String WEBSITE = "https://www.blutv.com/";



    @Before
    public void Testing() {

        System.setProperty("webdriver.chrome.driver", EXE_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,30);
    }

    @Test
    public void WrongInfo() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.linkText("Üye Girişi")).click();
        driver.findElement(By.id("username")).sendKeys("aycabilik@hotmail.co");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.cssSelector(".ant-form-item-control-input-content > .ant-btn > span")).click();
        Thread.sleep(5000);
    }




    @Test
    public void LogIn() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.linkText("Üye Girişi")).click();
        driver.findElement(By.id("username")).sendKeys("osmanbilik@hotmail.com");
        driver.findElement(By.id("password")).sendKeys("1306ayca");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ant-form-item-control-input-content > .ant-btn > span")).click();
        Thread.sleep(5000);
    }



    @After
    public void quit(){
        driver.quit();
    }

}

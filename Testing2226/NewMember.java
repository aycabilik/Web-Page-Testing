package Testing2226;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMember {
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
    public void Name () throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.id("displayName")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("SE2226Testing@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456a");
        Thread.sleep(1000);
        driver.findElement(By.id("permissions")).click();
        driver.findElement(By.cssSelector(".ant-col > .ant-btn > span")).click();
        Thread.sleep(2000);
    }

    @Test
    public void AlreadyEmail() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.id("displayName")).sendKeys("Ayça Bilik");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("ayca@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456a");
        Thread.sleep(1000);
        driver.findElement(By.id("permissions")).click();
        driver.findElement(By.cssSelector(".ant-col > .ant-btn > span")).click();
        Thread.sleep(2000);
    }

    @Test
    public void WrongEmail() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.id("displayName")).sendKeys("Ayça Bilik");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("aaaa");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456a");
        Thread.sleep(1000);
        driver.findElement(By.id("permissions")).click();
        driver.findElement(By.cssSelector(".ant-col > .ant-btn > span")).click();
        Thread.sleep(2000);
    }


    @Test
    public void WrongPassword() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(2000);
        driver.findElement(By.id("displayName")).sendKeys("Ayça Bilik");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("ayca@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.id("permissions")).click();
        driver.findElement(By.cssSelector(".ant-col > .ant-btn > span")).click();
        Thread.sleep(2000);
    }

    @Test
    public void Verify() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.id("displayName")).sendKeys("Ayça Bilik");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("SE2226Testing@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("123456a");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ant-col > .ant-btn > span")).click();
        Thread.sleep(3000);
    }

    @After
    public void quit(){
        driver.quit();
    }

}

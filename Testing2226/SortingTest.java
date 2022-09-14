package Testing2226;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortingTest {

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
    public void LogIn() throws InterruptedException {
        driver.get(WEBSITE);
        driver.manage().window().setSize(new Dimension(1552, 840));
        Thread.sleep(1000);
        driver.findElement(By.linkText("Üye Girişi")).click();
        driver.findElement(By.id("username")).sendKeys("osmanbilik@hotmail.com");
        driver.findElement(By.id("password")).sendKeys("1306ayca");
        driver.findElement(By.cssSelector(".ant-form-item-control-input-content > .ant-btn > span")).click();
        Thread.sleep(2000);
    }


    @Test
    public void SortingTest() throws InterruptedException {
        LogIn();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Film")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Türler")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".jsx-1474944704:nth-child(7) > .jsx-1474944704")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sıralama")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".sort .jsx-1474944704:nth-child(1) > .jsx-1474944704")).click();
        Thread.sleep(3000);
    }

    @After
    public void quit(){
        driver.quit();
    }
}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyTest1 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\skillbox\\MyImtTests\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testNegativResult() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.id("size")).sendKeys("43");
        driver.findElement(By.id("check-size-button")).click();
        var actualText = driver.findElement(By.id("size-success")).getText();
        var expectedText = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("В нашем магазине нет обуви вашего размера", actualText, expectedText);

    }
}
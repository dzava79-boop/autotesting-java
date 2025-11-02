import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFynnySocks4 {
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
    public void Test1Entrance() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var email = By.cssSelector("#email");
        var password = By.cssSelector("#password");
        var button = By.cssSelector("#submit");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(button).click();
        var error = driver.findElement(By.cssSelector("#error")).getText();
        Assert.assertEquals("Некорректный email или пароль", error);
    }
}

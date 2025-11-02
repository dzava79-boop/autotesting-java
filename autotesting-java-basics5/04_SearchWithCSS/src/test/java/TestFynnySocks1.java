import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFynnySocks1 {
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

    private By resultLocator = By.tagName("pre");

    @Test
    public void Test1Entrance() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/index.html");
        var email = By.name("email");
        var password = By.id("password");
        var button = By.className("form-submit");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(button).click();
        Assert.assertTrue("Не отобразился текст про email и пароль", driver.findElement(resultLocator).isDisplayed());
        Assert.assertEquals("Некорректный email или пароль", driver.findElement(resultLocator).getText());


    }

}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBookStore2 {
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
    public void test1BookStore() {
        driver.navigate().to("https://qajava.skillbox.ru/");
        var bookElement = driver.findElements(By.className("book-info"));
        Assert.assertEquals(15, bookElement.size());

    }
}

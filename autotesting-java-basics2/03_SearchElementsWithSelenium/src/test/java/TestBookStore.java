import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBookStore {
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
    public void testBookStore() {
        driver.navigate().to("https://qajava.skillbox.ru/");
        var feedbackElement = driver.findElement(By.linkText("Обратная связь"));
        var preordersElement = driver.findElement(By.linkText("Предзаказы"));
        var basketElement = driver.findElement(By.className("book-info"));
        var quantityInCartElement = driver.findElement(By.id("cart_count"));
        var bookElement = driver.findElement(By.id("genres"));
        var searchByStoreElement = driver.findElement(By.id("search-input"));
    }



}

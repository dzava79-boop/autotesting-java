import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPracticNew {

    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\skillbox\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void testBookPractic() {
      driver.navigate().to("https://qajava.skillbox.ru/index.html");
      var firstLocator = By.cssSelector("[test-info=about-us]");
      var secondLocator = By.cssSelector("a[href='']");
      var thirdLocator = By.cssSelector("option[selected]");
      var fourthLocator = By.cssSelector("div.book-price");
      var fifthLocator = By.cssSelector("button[class*='book']");
      var sixthLocator = By.cssSelector("[class*='main']");
      var seventhLokator = By.cssSelector("a[class*='menu']");

    }

    @Test
    public void testBookPractik2() {
        driver.navigate().to("https://qajava.skillbox.ru/index.html");
        var firstLocator = By.cssSelector("footer#footer > div");
        var secondLocator = By.cssSelector("li#genres > a");
        var thirdLocator = By.cssSelector("div.filter-container > *:last-child");
    }

    @Test
    public void testFunnySocks() {
        driver.navigate().to("https://qajava.skillbox.ru/module05/auth/index.html/");
        var firstLocator = By.cssSelector("section[class*='block'] > *:first-child");
        var secondLocator = By.cssSelector("form#login-form > *:last-child");
        var thirdLocator = By.cssSelector("body > *:nth-child(3)");
        var fourthLocator = By.cssSelector("div.footer__menuList > a:nth-of-type(1)");
    }
}

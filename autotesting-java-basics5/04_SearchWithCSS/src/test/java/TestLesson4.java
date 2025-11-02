import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLesson4 {
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
    public void testSummoningTheWizard() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson3/index.html");
        var fioLokator = By.cssSelector(".form-input.fio");
        var streetLokator = By.cssSelector(".data.form-input.street");
        var houseLokator = By.cssSelector(".form-input.house");
        var flatLokator = By.cssSelector(".form-input.flat");
        var datelokator = By.cssSelector(".form-input.date");
        driver.findElement(fioLokator).sendKeys("Иванов Иван Иванович");
        driver.findElement(streetLokator).sendKeys("Ленина");
        driver.findElement(houseLokator).sendKeys("1");
        driver.findElement(flatLokator).sendKeys("256");
        driver.findElement(datelokator).sendKeys("завтра");
        var buttonLokator = By.className("form-submit");
        driver.findElement(buttonLokator).click();
        var resultLokator = By.cssSelector(".form-result.result");
        Assert.assertTrue("Введеные данные не верны", driver.findElement(resultLokator).isDisplayed());
    }
}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineKino {
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
    public void testOnlineCinema() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys("Мстители: Финал");
        driver.findElement(By.name("serials")).sendKeys("Сверхъестественное");
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("ok")).click();
        var movieFilms = driver.findElement(By.id("best_films")).getText();
        var films = "Мстители: Финал";
        Assert.assertEquals(movieFilms, films);
    }

    @Test
    public void test2OnlineCinema() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys("Мстители: Финал");
        driver.findElement(By.name("serials")).sendKeys("Сверхъестественное");
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("fake-checkbox"));
        driver.findElement(By.className("fake-radiobutton"));
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("ok")).click();
        var movieFilms = driver.findElement(By.id("best_films")).getText();
        var films = "Мстители: Финал";
        Assert.assertEquals(movieFilms, films);
    }

    @Test
    public void test3OnlineCinema() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var menuElement = driver.findElement(By.id("prev"));
        var fieldFilmElement = driver.findElement(By.name("films"));
        var fieldSerialElement = driver.findElement(By.name("serials"));
        var buttonSavaElement = driver.findElement(By.className("section__button"));
        var buttonOneElement = driver.findElement(By.id("one"));
        var buttonTwoElement = driver.findElement(By.id("two"));
        var voiceActingElement = driver.findElement(By.className("section__module"));


    }
}

package Base;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest extends CharacterGenerator{

    public static String preEt = CharacterGenerator.generateCharacters(7);
    public static String afterMinBoundVal = CharacterGenerator.generateCharacters(6);

    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jovan\\.cache\\selenium\\chromedriver\\win64\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);

        wdWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        actions = new Actions(driver);
        driver.get("https://sasomange.rs/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {


       // driver.quit();
    }
}



import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    public Select select;

    @Before
    public void setup(){
        // WebDriverManager koy
        System.setProperty("webdriver.chrome.driver","src//test//resources//chromedriver.exe");
        this.driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ChromeOptions option = new ChromeOptions();
        //option.addArguments("start maximized");
        driver.get("https://n11.com");


    }
    @After
    public void tearDown(){
        driver.quit();
    }

}

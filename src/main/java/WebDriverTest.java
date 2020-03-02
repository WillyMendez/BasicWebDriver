import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
    public static void  main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.cr/");
        driver.close();
    }
}

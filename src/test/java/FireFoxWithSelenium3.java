import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWithSelenium3 {

    public static void main(String[] args) {

        //Set path to gecko.driver
        System.setProperty("webdriver.gecko.driver","/Users/kknochenmus/selenium-java-3.5.3/geckodriver");

        //Set browser instance
        WebDriver driver = new FirefoxDriver();

        //Open the google.com URL in Firefox
        driver.get("https://google.com");
    }
}

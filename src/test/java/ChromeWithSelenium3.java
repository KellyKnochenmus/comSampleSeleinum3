import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithSelenium3 {

    public static void main(String[] args) {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //Open the google.com URL in Chrome
        driver.get("https://google.com");
    }
}

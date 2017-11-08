import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithSelenium3 {

    public static void main(String[] args) {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //Maximize Browser Window
        driver.manage().window().maximize();

        //Set the Browser Window to a Specific Size
        driver.manage().window().setSize(new Dimension(300, 100));


        //Open the google.com URL in Chrome
        driver.get("https://google.com");

        //To find the Search box element by CSS Selector:
        WebElement inputSearchBox = driver.findElement(By.cssSelector("#lst-ib"));

        //To find the 'Google Search" button element by Absolute XPath:
        WebElement btnGoogleSearchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));

    }
}

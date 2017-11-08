import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedAPIInteractions {

    @Test
    public void DragAndDropFromAndToElements() {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //How to call actions class in Selenium
        Actions actions = new Actions(driver);

        //Open the google.com URL in Chrome
        driver.get("https://jqueryui.com");

        //Action #1 : Drag and Drop from one element to another element
            //Find the element and find final location where we want to drag and drop the element
            driver.get("https://jqueryui.com/droppable");
            //Switch frame
            driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
            //Find elements
            WebElement draggableElement = driver.findElement(By.cssSelector("#draggable"));
            WebElement droppableElement = driver.findElement(By.cssSelector("#droppable"));
            //Perform drag and drop
            actions.dragAndDrop(draggableElement,droppableElement).build().perform();

        //Close Browser
        driver.quit();
    }


    @Test
    public void DragAndDropToLocation() {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //How to call actions class in Selenium
        Actions actions2 = new Actions(driver);

        //Open the google.com URL in Chrome
        driver.get("https://jqueryui.com");

        //Action #2 : Drag and Drop an element to a set of screen coordinates
        //Find the element and find final location where we want to drag and drop the element
        driver.get("https://jqueryui.com/draggable");
        //Switch frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
        //Find elements
        WebElement draggableElement = driver.findElement(By.cssSelector("#draggable"));

        //Perform drag and drop by left pixel and top pixel
        actions2.dragAndDropBy(draggableElement,347,71).build().perform();

        //Close Browser
        driver.quit();
    }

    @Test
    public void KeyCombinations() {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //How to call actions class in Selenium
        Actions actions3 = new Actions(driver);

        //Open the google.com URL in Chrome
        driver.get("https://jqueryui.com");

        //Action #3 :
        //Find the element and find final location where we want to drag and drop the element
        driver.get("https://jqueryui.com/draggable");
        //Switch frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
        //Find elements
        WebElement draggableElement = driver.findElement(By.cssSelector("#draggable"));

        //Perform the Send Keys combination of "Ctrl + A"
        actions3.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();

        //Close Browser
        driver.quit();

    }

    @Test
    public void DragAndDropBySliderBar() {

        //Set path to chrome.driver
        System.setProperty("webdriver.chrome.driver","/Users/kknochenmus/selenium-java-3.5.3/chromedriver");

        //Set browser instance
        WebDriver driver = new ChromeDriver();

        //How to call actions class in Selenium
        Actions actions4 = new Actions(driver);

        //Open the google.com URL in Chrome
        driver.get("https://jqueryui.com");

        //Action #4 : Drag and Drop a Slider Bar
        //Find the element and find final location where we want to drag and drop the element
        driver.get("https://jqueryui.com/slider");
        //Switch frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
        //Find elements
        WebElement sliderBarElement = driver.findElement(By.cssSelector("#slider > span"));

        //Perform drag and drop by left pixel and top pixel
        actions4.dragAndDropBy(sliderBarElement,50,0).perform();

        //Close Browser
        driver.quit();
    }



}

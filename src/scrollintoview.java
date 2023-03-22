import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scrollintoview {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement element = driver.findElement(By.id("elementId"));
        // Scroll to the element using JavaScript
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);

        driver.quit();



    }
}

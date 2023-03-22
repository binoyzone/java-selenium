import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findElements {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //  Locating single element
        WebElement element = driver.findElement(By.id("elementId"));
        //  Locating multiple elements
        List<WebElement> elements = driver.findElements(By.className("className"));

        driver.quit();

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class selectDropDown {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Find the dropdown menu element
        Select dropdown = new Select(driver.findElement(By.id("dropdown-menu")));
        // Select an option by visible text
        dropdown.selectByVisibleText("Option 1");
        // Select an option by value
        dropdown.selectByValue("option1 value");
        // Select an option by index
        dropdown.selectByIndex(1);

        driver.quit();




    }
}

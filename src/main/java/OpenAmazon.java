import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenAmazon {

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();

        // Required for EC2/Linux servers
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in");

        // Wait for page to load
        Thread.sleep(10000);

        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}